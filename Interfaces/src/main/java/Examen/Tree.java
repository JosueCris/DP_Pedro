package Examen;

public class Tree {
    int data;
    Tree left;
    Tree right;

    public Tree(int dato) {
        this.data = dato;
        this.left = null;
        this.right = null;
    }

    public void inOrden() {
        if (this.left != null)
            this.left.inOrden();
        System.out.println(this.data);
        if (this.right != null)
            this.right.inOrden();
    }

    public void add(int data) {
        if (data < this.data) {
            if (this.left == null) {
                this.left = new Tree(data);
                return;
            }
            this.left.add(data);
            return;
        }
        if (this.right == null) {
            this.right = new Tree(data);
            return;
        }
        this.right.add(data);
    }

    public void small() {
        if (this.left == null) {
            System.out.println("Small: " + this.data);
            return;
        }
        this.left.small();
    }

    public boolean search(int data){
        Tree aux = this;
        if (aux == null)
            return false;
        else
        if(data == aux.data)
            return  true;
        else
        if (data < aux.data)
            return left.search(data);
        else
            return right.search(data);
    }
}
