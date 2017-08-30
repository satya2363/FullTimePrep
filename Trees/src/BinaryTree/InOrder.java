package BinaryTree;
public class InOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BinaryTree node = new BinaryTree();
		
		node.setData(10);

		//root.left=root;
		//root.left.data=6;
		//root.right=root;
		//root.right.data = 14;
		//
//			preOrder(node);

		node.setLeft(new BinaryTree());
		node.getLeft().setData(5);
		node.setRight(new BinaryTree());
		node.getRight().setData(14);

		node.getLeft().setLeft(new BinaryTree());
		node.getLeft().setRight(new BinaryTree());

		node.getLeft().getLeft().setData(3);
		node.getLeft().getRight().setData(6);

		node.getRight().setLeft(new BinaryTree());
		node.getRight().setRight(new BinaryTree());

		node.getRight().getLeft().setData(11);
		node.getRight().getRight().setData(16);
	
	inOrder(node);

	}
	
	
	private static void inOrder(BinaryTree node) {
		
		if(node==null)
			return;
		inOrder(node.getLeft());
		
		System.out.println(node.getData());
		inOrder(node.getRight());
	}

}
