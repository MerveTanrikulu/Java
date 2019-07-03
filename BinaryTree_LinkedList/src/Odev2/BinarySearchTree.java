/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Odev2;

import java.util.ArrayList;

/**
 * @file BinarySearchTree
 * @description Tree'nin ekleme , arama , size ve listeleme fonksiyonlarını barındıyor
 * @assigment 2.Ödev
 * @date 30.04.2018
 * @author Merve TANRIKULU - merve.kedim@gmail.com
 */
public class BinarySearchTree<T> {

    public TreeNode<T> root;
    ArrayList list = new ArrayList<>();

    public void insert(T newData) {
        TreeNode<T> newNode = new TreeNode<>(newData);

        if (root == null) {
            root = newNode;
        } else {
            TreeNode<T> temp = root;
            TreeNode<T> parent;

            while (temp != null) {
                parent = temp;

                if (newData.hashCode() > temp.data.hashCode()) {
                    temp = temp.rightChild;
                    if (temp == null) {
                        parent.rightChild = newNode;
                    }
                } else if (newData.hashCode() < temp.data.hashCode()) {
                    temp = temp.leftChild;
                    if (temp == null) {
                        parent.leftChild = newNode;
                    }
                } else {
                    temp = null;
                }
            }
        }
    }

    public TreeNode<T> search(T data) {
        return search(data, root);
    }

    public TreeNode search(T data, TreeNode t) {
        if (t == null) {
            //System.out.println("Bulunamadı");
            return null;
        } else if (data.hashCode() < t.data.hashCode()) {
            return search(data, t.leftChild);
        } else if (data.hashCode() > t.data.hashCode()) {
            return search(data, t.rightChild);
        } else {
            // System.out.println(t.data);
            return t;
        }
    }

    int sizeRecursive() {
        return sizeRecursive(root);
    }

    private int sizeRecursive(TreeNode<T> n) {
        if (n == null) {
            return 0;
        } else {
            return 1 + sizeRecursive(n.rightChild) + sizeRecursive(n.leftChild);
        }
    }

    private void printTree(TreeNode t) {
        if (t != null) {
            printTree(t.leftChild);
            System.out.println(t.data);
            printTree(t.rightChild);
        }
    }

    public void printTree() {
        if (root == null) {
            System.out.println("Empty tree");
        } else {
            printTree(root);
        }
    }

    public void getItem(TreeNode t) {
        if (t != null) {
            getItem(t.leftChild);
            list.add((t.data));
            getItem(t.rightChild);
        }
    }

    public ArrayList<String> getListItems() {
        list.remove(list);
        list.clear();

        if (root == null) {
            System.out.println("Empty tree");
        } else {
            getItem(root);
        }
        return list;
    }
}
