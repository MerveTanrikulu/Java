/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Odev2;

/**
 * @file Node
 * @description LinkedList için gerekli olan node'ları , datayı ve LinkedList'in node'nun içine Tree'i eklemek için oluşturulan bst bulunuyor
 * @assigment 2.Ödev
 * @date 30.04.2018
 * @author Merve TANRIKULU - merve.kedim@gmail.com
 */
public class Node <T>{
    T data;
    Node nextNode;  
    
    BinarySearchTree <T> bst = new BinarySearchTree<>();
    
    public Node(T data) {
        this.data = data;
    }   
}
