#include "Tree.h"
#include <stdlib.h>
#include <stdio.h>

TreeNode* createNode(int val) {

    TreeNode* result = malloc(sizeof(TreeNode));

    if(result != NULL) {
        result -> left = NULL;
        result -> right = NULL;
        result -> val = val;
    }

    return result;
    
    

}

TreeNode* insert(TreeNode* root, int data) {

    if(root == NULL)  {
        root = createNode(data);
    }

    else if(data <= root -> val) {
        root -> left = insert(root -> left, data);

    }

    else {
        root -> right = insert(root -> right, data);
    }

    return root;

}

void inorder(TreeNode* root) {

    if(root == NULL) {
        return;
    }

    inorder(root -> left);
    printf("%d ", root -> val);
    inorder(root -> right);

}

int main() {

    TreeNode* root = createNode(5);
    root = insert(root, 1);
    root = insert(root, 6);

    inorder(root);
    printf("\n");

}