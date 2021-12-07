typedef struct TreeNode{
    int val;
    struct TreeNode* right;
    struct TreeNode* left;
}TreeNode;

TreeNode* insert(TreeNode* root, int data);
void inorder(TreeNode* root);
TreeNode *createNode(int val);
