/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Odev2;

/**
 * @file Node
 * @description Tree için gerekli olan node'ları ve datayı tutan sınıf 
 * @assigment 2.Ödev
 * @date 30.04.2018
 * @author Merve TANRIKULU - merve.kedim@gmail.com
 */
public class TreeNode <T> {

   T data;
   TreeNode leftChild;
   TreeNode rightChild;


    public TreeNode(T data) {
        this.data = data;
    }
}
   
    
