public class ExerciseFour
{
    public static void main (String[] args)
    {
	Tree t = new Tree ();
	TreeNode p = new TreeNode ("46", 123, null, null, null);
	t.insertNode(p);
	p = new TreeNode ("31", 823, null, null, null);
	t.insertNode(p);
	p = new TreeNode ("22", 422, null, null, null);
	t.insertNode(p);
	p = new TreeNode ("38", 439, null, null, null);
	t.insertNode(p);
	p = new TreeNode ("76", 523, null, null, null);
	t.insertNode(p);
	p = new TreeNode ("57", 452, null, null, null);
	t.insertNode(p);
	p = new TreeNode ("86", 923, null, null, null);
	t.insertNode(p);
	p = new TreeNode ("34", 431, null, null, null);
	t.insertNode(p);
	p = new TreeNode ("41", 947, null, null, null);
	t.insertNode(p);
	p = new TreeNode ("39", 543, null, null, null);
	t.insertNode(p);
	p = new TreeNode ("43", 872, null, null, null);
	t.insertNode(p);
	t.printTree(0);
	
	
	/*
	1)
	The sequence of statement is not unique.

	2)
	Because we can change the statement's order or sequence
	if the node we are inserting are in the same level       
	
	3)
	There is 352 possible insertNode() sequences
	
	4)
	If we insert nodes by the level, that would give us 192
	possible sequences. Since the 0 level has to be insert 1st,
	so it does not affect the possile sequences. There are 2 nodes
	in the 1 level, so there are 2 way of inserting that. There are 4 nodes
	in the 2 level, so there are 24 ways to insert, and 4 ways for 3 level,
	4 ways for 4 level. So we get 1 * 2 * 24 * 2 * 2 = 192. Or we can add the 
	left branch of the root 1st and right brand second. That would give us 16 different
	ways. If we add right branch of the root 1st and left second, we would get 16 different
	ways, too. Or we can add right brand of the root while we are adding the
	left brand. Vise versa. That would give us 128 different ways. 
	   
	*/
    }
}
