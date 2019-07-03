/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Odev2;

import java.util.ArrayList;

/**
 * @file LinkedList
 * @description LinkedList'in , Tree'nin ekleme fonksiyonlarını ve Frame'de bulunan arama ve listeleme için yazılmış olan fonksiyonları barındırıyor.
 * @assigment 2.Ödev
 * @date 30.04.2018
 * @author Merve TANRIKULU - merve.kedim@gmail.com
 */
public class LinkedList<T> {

    Node<T> header;

    public void addLast(T data) {
        Node<T> temp = header;
        Node<T> newNode = new Node<>(data);

        if (header == null) {
            header = newNode;
        } else {
            while (temp.nextNode != null) {
                temp = temp.nextNode;
            }
            temp.nextNode = newNode;
        }

    }

    public void addTree(T data) {
        Node<T> temp = header;
        
        while (temp.nextNode != null) {
            temp = temp.nextNode;
        }
        temp.bst.insert(data);
    }

    public String printList() {
        Node temp = header;
        while (temp != null) {
            System.out.println(temp.data + "=>");
            temp.bst.printTree();
            temp = temp.nextNode;
        }
        return null;
    }

    public ArrayList<String> getListItems() {
        ArrayList<String> list = new ArrayList<>();
        Node temp = header;
        while (temp != null) {
            list.add(temp.data + "=>");
            list.addAll(list.size(), temp.bst.getListItems());
            //list.addAll(temp.bst.getListItems());
            temp = temp.nextNode;
        }
        return list;
    }

    public int size() {
        Node temp = header;
        int size = 0;
        while (temp != null) {
            size++;
            temp.bst.printTree();
            temp = temp.nextNode;

        }
        return size;
    }

    public String search(T find) {
        Node temp = header;
        getListItems();
        while (temp != null) {
            for (int i = 0; i < temp.bst.list.size(); i++) {
                if (temp.bst.list.get(i).toString().equals(find)) {
                    return "Aranan kelime" + " " + temp.data + " " + "dosyasında bulundu";
                }
            }
            temp = temp.nextNode;
        }
        return "Aranan kelime bulunamadı";

    }

}
