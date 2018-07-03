package me.alfod.medium;

import java.util.*;

/**
 * @author Yang Dong
 * @createTime 2018/7/3  13:08
 * @lastUpdater Yang Dong
 * @lastUpdateTime 2018/7/3  13:08
 * @note
 */
public class GenerateParentheses {
    public List<String> generateParenthesis(int n) {
        LinkedList<String> item = new LinkedList<>();
        LinkedList<String> tempItem;
        HashSet<LinkedList<String>> sets = new HashSet<>();
        HashSet<LinkedList<String>> tempSets = new HashSet<>();
        sets.add(item);
        for (int i = 0; i < n; i++) {
            tempSets.clear();
            for (LinkedList<String> set : sets) {
                if (set.isEmpty()) {
                    set.add("(");
                    set.add(")");
                } else {
                    for (int i1 = 0; i1 < set.size(); i1++) {
                        tempItem = (LinkedList<String>) ((LinkedList<String>) set).clone();
                        tempItem.add(i1, ")");
                        tempItem.add(i1, "(");
                        tempSets.add(tempItem);
                    }
                    set.addLast("(");
                    set.addLast(")");
                }
            }
            sets.addAll(tempSets);
        }
        Set<String> result = new HashSet<>(sets.size());
        StringBuilder string = new StringBuilder(2 * n + 1);
        for (LinkedList<String> set : sets) {
            string.setLength(0);
            for (String s : set) {
                string.append(s);
            }
            result.add(string.toString());
        }

        return new ArrayList<>(result);

    }
}
