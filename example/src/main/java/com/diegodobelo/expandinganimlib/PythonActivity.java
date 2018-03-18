/**
 Copyright (c) 2016, Diego Bezerra <diego.bezerra@gmail.com>
 Permission to use, copy, modify, and/or distribute this software for any purpose
 with or without fee is hereby granted, provided that the above copyright notice
 and this permission notice appear in all copies.
 THE SOFTWARE IS PROVIDED "AS IS" AND THE AUTHOR DISCLAIMS ALL WARRANTIES WITH
 REGARD TO THIS SOFTWARE INCLUDING ALL IMPLIED WARRANTIES OF MERCHANTABILITY AND
 FITNESS. IN NO EVENT SHALL THE AUTHOR BE LIABLE FOR ANY SPECIAL, DIRECT, INDIRECT,
 OR CONSEQUENTIAL DAMAGES OR ANY DAMAGES WHATSOEVER RESULTING FROM LOSS OF USE,
 DATA OR PROFITS, WHETHER IN AN ACTION OF CONTRACT, NEGLIGENCE OR OTHER TORTIOUS
 ACTION, ARISING OUT OF OR IN CONNECTION WITH THE USE OR PERFORMANCE OF THIS SOFTWARE.
 **/
package com.diegodobelo.expandinganimlib;

import android.app.Activity;

import android.content.Intent;

import android.os.Bundle;
import android.view.View;

import android.widget.TextView;


import com.diegodobelo.expandingview.ExpandingItem;
import com.diegodobelo.expandingview.ExpandingList;
import com.example.videoplayback.VideoStreamingActivity;


public class PythonActivity extends Activity {
    private ExpandingList mExpandingList;
    interface OnItemCreated {
        void itemCreated(String title);
    }
    public String aamit;
    private ExpandingItem mExpandedItem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_python);
        mExpandingList = (ExpandingList) findViewById(R.id.expanding_list_main);
        createItems();


    }

    private void createItems() {
        addItem("Course Overview",new String[]{"001 Course Introduction.mp4","002 Course Curriculum Overview.mp4","003 Python 2 vs Python 3.mp4","004 How to Approach This Course.mp4"},R.color.pink,R.drawable.ic_ghost);
        addItem("Python Setup",new String[]{"007 Jupyter Notebook Installation.mp4","008 IDE Selection.mp4","009 Jupyter (iPython) Notebooks.mp4","010 FAQ - Notebooks.mp4","011 Additional Resources.mp4","012 Git and Github Overview (Optional).mp4"},R.color.orange,R.drawable.ic_ghost);
        addItem("Python Object and Data Structure Basics",new String[]{"013\\ Numbers.mp4","015\\ Strings.mp4","017\\ Print\\ Formatting.mp4","019\\ Lists.mp4","021\\ Dictionaries.mp4","023\\ Tuples.mp4","024\\ Files.mp4","025\\ Sets\\ and\\ Booleans.mp4","027\\ Objects\\ and\\ Data\\ Structures\\ Assessment\\ Test.mp4","028\\ Objects\\ and\\ Data\\ Structures\\ Assessment\\ -\\ Solutions.mp4"},R.color.yellow,R.drawable.ic_ghost);
        addItem("Python Comparison Operators",new String[]{"029 Comparison Operators.mp4","030 Chained Comparison Operators.mp4"},R.color.purple,R.drawable.ic_ghost);
        addItem("Python Statements",new String[]{"031\\ Introduction\\ to\\ Python\\ Statements.mp4","032\\ if_\\ elif_\\ and\\ else\\ Statements.mp4","033\\ for\\ Loops.mp4","034\\ while\\ Loops.mp4","035\\ range().mp4","036\\ List\\ Comprehensions.mp4","037\\ Statements\\ Assessment\\ Test.mp4","038\\ Statements\\ Assessment\\ Solutions.mp4"},R.color.blue,R.drawable.ic_ghost);
        addItem("Methods and Functions",new String[]{"039\\ Methods.mp4","040\\ Functions.mp4","041\\ lambda\\ expressions.mp4","042\\ Nested\\ Statements\\ and\\ Scope.mp4","043\\ Functions\\ and\\ Methods\\ -\\ Homework\\ Assignment.mp4","045\\ Functions\\ and\\ Methods\\ Homework\\ -\\ Solutions.mp4"},R.color.green,R.drawable.ic_ghost);
        addItem("Milestone Project - 1",new String[]{"047\\ Milestone\\ Project\\ 1\\ -Assignment\\ Overview.mp4","049\\ Milestone\\ Project\\ 1\\ -\\ Solution\\ Walkthrough\\ -\\ Part\\ 1.mp4","050\\ Milestone\\ Project\\ 1\\ -\\ Solution\\ Walkthrough\\ -\\ Part\\ 2.mp4","051\\ Milestone\\ Project\\ 1\\ -\\ Solution\\ Walkthrough\\ -\\ Part\\ 3.mp4","052\\ Advanced\\ Project\\ Solution\\ Overview.mp4"},R.color.pink,R.drawable.ic_ghost);
        addItem("Object Oriented Programming",new String[]{"053\\ OOP\\ -\\ Part\\ 1\\ -\\ Objects.mp4","054\\ OOP\\ -\\ Part\\ 2\\ -\\ Classes.mp4","055\\ OOP\\ -\\ Part\\ 3\\ -Methods.mp4","056\\ OOP\\ -\\ Part\\ 4\\ -\\ Inheritance.mp4","057\\ OOP\\ -\\ Part\\ 5\\ -\\ Special\\ Methods.mp4","058\\ OOP\\ Homework\\ Assignment.mp4","059\\ OOP\\ Homework\\ Solution.mp4"},R.color.orange,R.drawable.ic_ghost);
        addItem("Errors and Exceptions Handling",new String[]{"060 Errors and Exceptions.mp4","061 Exception Handling_ try_ except_ finally.mp4","062 Errors and Exceptions Homework.mp4","063 Errors and Exceptions - Solutions.mp4"},R.color.yellow,R.drawable.ic_ghost);
        addItem("Milestone Project - 2",new String[]{"064 Project Overview.mp4","065 Project 2 Solution.mp4"},R.color.purple,R.drawable.ic_ghost);
        addItem("Modules and Packages",new String[]{"066 Modules_ Packages_ and Imports.mp4","067 Modules and Packages Assignment.mp4"},R.color.blue,R.drawable.ic_ghost);
        addItem("Built-in Functions",new String[]{"070\\ Map.mp4","071\\ Reduce.mp4","072\\ Filter.mp4","073\\ Zip.mp4","074\\ Enumerate.mp4","075\\ all()\\ and\\ any().mp4","076\\ Complex.mp4","077\\ Built-in\\ Functions\\ Assessment\\ Test.mp4","078\\ Built-in\\ Functions\\ Assessment\\ Test\\ Solutions.mp4"},R.color.green,R.drawable.ic_ghost);
        addItem("Python Decorators",new String[]{"079 Decorators - Part 1.mp4","080 Decorators - Part 2.mp4","081 Decorators - Part 3.mp4","082 Decorators Homework.mp4"},R.color.pink,R.drawable.ic_ghost);
        addItem("Python Generators",new String[]{"083 Iteration vs Generation.mp4","084 Creating Generators.mp4","085 Iterators and Generators Homework.mp4","086 Iterators and Generators Homework  - Solutions.mp4"},R.color.orange,R.drawable.ic_ghost);
        addItem("Final Capstone Python Project",new String[]{"Final Capstone Project.mp4"},R.color.yellow,R.drawable.ic_ghost);
        addItem("Advanced Python Modules",new String[]{"088\\ Collections\\ Module\\ -\\ counter.mp4","089\\ Collections\\ Module\\ -\\ defaultdict.mp4","090\\ Collections\\ Module\\ -\\ OrderedDict.mp4","091\\ Collections\\ Module\\ -\\ namedtuple.mp4","092\\ Datetime.mp4","093\\ Python\\ Debugger\\ -\\ pdb.mp4","094\\ Timing\\ your\\ code\\ -\\ timeit.mp4","095\\ Regular\\ Expressions\\ -re.mp4","096\\ StringIO.mp4"},R.color.purple,R.drawable.ic_ghost);
        addItem("Advanced Python Objects and Data Structures",new String[]{"Advanced Numbers.mp4","Advanced Strings.mp4","Advanced Sets.mp4","Advanced Dictionaries.mp4","Advanced Lists.mp4","Advanced Python Objects Assessment Test.mp4","Advanced Python Objects Test - Solutions.mp4"},R.color.blue,R.drawable.ic_ghost);




    }


    public void addItem(String title, String[] subItems, int colorRes, int iconRes ) {
        for (int index =0; index < subItems.length; index++){

            subItems[index] = subItems[index].replace(".mp4","");
        subItems[index] = subItems[index].replace("\\","");}
        //Let's create an item with R.layout.expanding_layout
        final ExpandingItem item = mExpandingList.createNewItem(R.layout.expanding_layout);

        //If item creation is successful, let's configure it
        if (item != null) {
            item.setIndicatorColorRes(colorRes);
            item.setIndicatorIconRes(iconRes);

            //It is possible to get any view inside the inflated layout. Let's set the text in the item
            ((TextView) item.findViewById(R.id.title)).setText(title);




            //We can create items in batch.
            item.createSubItems(subItems.length);
            for (int i = 0; i < item.getSubItemsCount(); i++) {
                //Let's get the created sub item by its index
                final View view = item.getSubItemView(i);

                //Let's set some values in
                configureSubItem(item, view, subItems[i]);


            }
            item.setStateChangedListener(new ExpandingItem.OnItemStateChanged() {
                @Override
                public void itemCollapseStateChanged(boolean expanded) {
                    if (mExpandedItem != null && mExpandedItem.isExpanded()) {
                        mExpandedItem.toggleExpanded();
                    }
                    if (expanded) {
                        mExpandedItem = item;
                    } else if (mExpandedItem.equals(item)) {
                        mExpandedItem = null;
                    }
                }
            });





        }

    }


    private void configureSubItem(final ExpandingItem item, final View view, final String subTitle) {
        ((TextView) view.findViewById(R.id.sub_title)).setText(subTitle);
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String title = ((TextView) item.findViewById(R.id.title)).getText().toString();
                String text = title ;
                String course = "python";
                String finaltital = text.replaceAll(" ","%20");
                String finalsubitem = subTitle.toString().replaceAll(" ","%20");
                String subitem = subTitle.toString();

                startActivity(new Intent(PythonActivity.this , VideoStreamingActivity.class).putExtra("real",subitem).putExtra("amit",finaltital).putExtra("bera",finalsubitem).putExtra("app",course));

                //Toast.makeText(getApplicationContext(),subitem,Toast.LENGTH_SHORT).show();
                //.putExtra("title",title).putExtra("folder",subitem));
            }
        });
    }




}
