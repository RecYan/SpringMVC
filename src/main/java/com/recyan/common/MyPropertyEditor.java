package com.recyan.common;

import com.recyan.object.User;

import java.beans.PropertyEditorSupport;


/**
 * Created by Yan_Jiang on 2018/8/5.
 */
public class MyPropertyEditor extends PropertyEditorSupport {
    @Override
    public void setAsText(String text) throws IllegalArgumentException {
        User u = new User();
        String[] textArray = text.split(",");
        u.setName(textArray[0]);
        u.setAge(Integer.parseInt(textArray[1]));
        this.setValue(u);
    }

    public static void main(String[] args) {
        MyPropertyEditor editor = new MyPropertyEditor();
        editor.setAsText("tom,22");
        System.out.println(editor.getValue());
    }
}
