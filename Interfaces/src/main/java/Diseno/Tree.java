package Diseno;

public class Tree {
    private int data;
    private Tree left;
    private Tree right;

    public Tree(int value) {
        this.data = value;
        this.left = null;
        this.right = null;
    }
    
    public void add(int value) {
        if (value < this.data) {
            if (left == null)
                left = new Tree(value);
            else
                left.add(value);
        }
        else {
            if (right == null)
                right = new Tree(value);
            else
                right.add(value);
        }
    }

    public void preOrden() {
        System.out.print(data+" -> ");
        if(left != null)
            left.preOrden();
        if(right != null)
            right.preOrden();
    }

    public void inOrden() {
        if(left != null)
            left.inOrden();
        System.out.print(data+" -> ");
        if(right != null)
            right.inOrden();
    }

    public void postOrden() {
        if(left != null)
            left.postOrden();
        if(right != null)
            right.postOrden();
        System.out.print(data+" -> ");
    }

    public int tell()
    {
        int count = 1;
        if(left != null)
            count += left.tell();

        if(right != null)
            count += right.tell();
        return count;
    }

    public int higherNode() {
        Tree aux = this;
        int higher = data;
        while(aux.right != null) {
            aux = aux.right;
            higher = aux.data;
        }
        return higher;
    }

    public void treeSearch(int value, int count) {
        if (this == null){
            System.out.println("Empty Tree!!!");
            return;
        }
        count++;
        if (value == this.data){
            System.out.println("Found item\nCycles: "+count);
            return;
        }
        if (value < this.data){
            if (this.left == null){
                System.out.println("Item doesn't exist\nCycles: "+count);
                return;
            }else {
                this.left.treeSearch(value, count);
            }
        }
        if (value > this.data){
            if (this.right == null){
                System.out.println("Item doesn't exist\nCycles: "+count);
            }else {
                this.right.treeSearch(value, count);
            }
        }
    }

    public void FatherAndSon(int value) {
        if(this.data == value) {
            System.out.println("Founded item");
            System.out.println("Root: "+this.data);
            return;
        }
        if(this.data > value) {
            if(this.left == null) {
                System.out.println("\nItem not found\n");
                return;
            }
            if(this.left.data == value) {
                System.out.println("Founded item");
                System.out.println("Father: "+this.data);
                System.out.println("Son: "+this.left.data);
                return;
            }
            else
                left.FatherAndSon(value);
        }
        if(this.data < value) {
            if(this.right == null) {
                System.out.println("\nItem not found\n");
                return;
            }
            if(this.right.data == value) {
                System.out.println("Founded item");
                System.out.println("Father: "+this.data);
                System.out.println("Son: "+this.right.data);
                return;
            }
            else
                right.FatherAndSon(value);
        }
    }

    //    public boolean search(int value){
//        Tree aux = this;
//        if (aux == null) {
//            return false;
//        }
//        else
//            if(value == aux.data) {
//            return  true;
//            }
//            else
//                if (value < aux.data) {
//                    return left.search(value);
//                }
//                else {
//                    return right.search(value);
//                }
//    }

}
