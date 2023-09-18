import java.util.List;

public class Tree {

    private Node root;
    private Tree subtree;

    public Tree(Node root, Tree subtree, List<Tree> list){
        this.root = root;
        if (subtree == null){
            this.subtree = subtree;
        }

    }

}
