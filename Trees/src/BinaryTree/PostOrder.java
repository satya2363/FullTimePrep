package BinaryTree;

public class PostOrder {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BinaryTree node = new BinaryTree();
		
		node.setData(10);

		node.setLeft(new BinaryTree());
		node.getLeft().setData(6);
		node.setRight(new BinaryTree());
		node.getRight().setData(14);

		node.getLeft().setLeft(new BinaryTree());
		node.getLeft().setRight(new BinaryTree());

		node.getLeft().getLeft().setData(3);
		node.getLeft().getRight().setData(5);

		node.getRight().setLeft(new BinaryTree());
		node.getRight().setRight(new BinaryTree());

		node.getRight().getLeft().setData(11);
		node.getRight().getRight().setData(16);
		
		postOrder(node);
	}
	
	private static void  postOrder(BinaryTree node){
		
		if(node == null)
			return;
		
		postOrder(node.getLeft());
		postOrder(node.getRight());
		System.out.println(node.getData());
		
	}

}
