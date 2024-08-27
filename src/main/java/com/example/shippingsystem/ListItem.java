package com.example.shippingsystem;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import javafx.collections.ObservableList;

import java.util.*;
@XStreamAlias("ListItem")
public class ListItem <T> {
    public ListNode<T> getFirst() {
        return first;
    }


    ListNode<T> first = null;
    public  int size;

    boolean isEmpty() {
        return first == null;
    }

    public int size() {
        return size;
    }

    public void add(T item) {
        ListNode<T> newNode = new ListNode<T>(item);
        if (first == null) {
            first = newNode;
        } else {
            ListNode<T> current = first;
            while (current.next() != null) {
                current = current.next();
            }
            current.next(newNode);
        }
        size++;
    }







}
