package books.promdev.chapt06_interface_inner_class.actions;

import books.promdev.chapt06_interface_inner_class.usermng.UserStatistic;

public class CreatorStatistic {
    public static UserStatistic createUserStatistic(long id) {
        UserStatistic temp = new UserStatistic();
        temp.setId(id);
        
        int mark = temp.getMark();
        temp.setMark(mark);
        return temp;        
    }
    public static void main(String[] args) {
        UserStatistic us = createUserStatistic(71);
        System.out.println(us.getMark());
    }
}