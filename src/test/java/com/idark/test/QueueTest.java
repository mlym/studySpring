package com.idark.test;

import com.idark.entity.User;
import org.junit.Before;
import org.junit.Test;

import java.util.concurrent.PriorityBlockingQueue;

public class QueueTest {

    private static PriorityBlockingQueue<User> queue = new PriorityBlockingQueue<User>();

    @Before
    public void addUser(){
        queue.offer(new User("iDark",10));
        queue.offer(new User("iDark",10));
    }

    @Test
    public void updateQueue(){
        queue.forEach(System.out::println);
        User user = queue.peek();
        user.setAge(1000);
        System.out.println("==========================");
        queue.forEach(System.out::println);
        System.out.println("==========================");


        User u1 = new User("iDark",20);
        System.out.println(queue.contains(u1));
    }
}