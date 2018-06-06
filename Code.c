//
//
// Definition for binary tree:
// typedef struct tree_##name {
//   type value;
//   struct tree_##name *left;
//   struct tree_##name *right;
// } tree_##name;
//
// tree_##name *alloc_tree_##name(type v) {
//   tree_##name *t = calloc(1, sizeof(tree_##name));
//   t->value = v;
//   return t;
// }

bool isEqual(tree_integer * t1, tree_integer * t2){
    return t1 && t2 ? 
        t1->value == t2->value && 
        isEqual(t1->left, t2->left) && 
        isEqual(t1->right, t2->right) 
        : t1 == t2;
}

bool isSubtree(tree_integer * t1, tree_integer * t2) {
    return t1 ? isEqual(t1, t2) || isSubtree(t1->left, t2) || isSubtree(t1->right, t2) : t2 == NULL;
}
