package BinaryTree;
public class PreOrder {
	
		public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BinaryTree node = new BinaryTree();
	
		node.setData(10);

		//root.left=root;
		//root.left.data=6;
		//root.right=root;
		//root.right.data = 14;
		//
		//preOrder(node);

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
	
	preOrder(node);
	}
	
	private static void preOrder(BinaryTree node) {
		// TODO Auto-generated method stub
		if( node != null )
		{
		System.out.println(node.getData());
		preOrder(node.getLeft());
		preOrder(node.getRight());
		}
		}

}
