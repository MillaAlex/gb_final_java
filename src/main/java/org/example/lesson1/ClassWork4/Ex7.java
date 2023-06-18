package org.example.lesson1.ClassWork4;

import java.util.Deque;
import java.util.LinkedList;

public class Ex7 {
    public static String simplifyPath(String path) {
        Deque<String> deq = new LinkedList<>();
        String[] subPath = path.split("/");
        for (String s : subPath) {
            if ("..".equals(s)) {
                if (!deq.isEmpty()) {
                    deq.pollLast();
                }
            } else if (!".".equals(s) && !"".equals(s)) {
                deq.add(s);
            }
        }
        if (deq.isEmpty()) return "/";
        StringBuilder res = new StringBuilder();
        while (!deq.isEmpty()) {
            res.append("/").append(deq.pop());
        }
        return res.toString();
    }
}


/**
 * Given a string path, which is an absolute path (starting with a slash '/') to a file or directory
 * in a Unix-style file system, convert it to the simplified canonical path.
 * In a Unix-style file system, a period '.' refers to the current directory, a double period '..'
 * refers to the directory up a level, and any multiple consecutive slashes (i.e. '//') are treated
 * as a single slash '/'. For this problem, any other format of periods such as '...' are treated as
 * file/directory names.
 * The canonical path should have the following format:
 * The path starts with a single slash '/'.
 * Any two directories are separated by a single slash '/'.
 * The path does not end with a trailing '/'.
 * The path only contains the directories on the path from the root directory to the target file or directory
 * (i.e., no period '.' or double period '..')
 * Return the simplified canonical path.
 */
