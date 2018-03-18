package com.diegodobelo.expandinganimlib;

import android.app.Activity;

import android.content.Intent;

import android.os.Bundle;
import android.view.View;

import android.widget.TextView;


import com.diegodobelo.expandingview.ExpandingItem;
import com.diegodobelo.expandingview.ExpandingList;
import com.example.videoplayback.VideoStreamingActivity;


public class SketchActivity extends Activity {
    private ExpandingList mExpandingList;
    interface OnItemCreated {
        void itemCreated(String title);
    }
    public String aamit;
    private ExpandingItem mExpandedItem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sketch);
        mExpandingList = (ExpandingList) findViewById(R.id.expanding_list_main);
        createItems();


    }

    private void createItems() {
        addItem("intro-to-course",new String[]{"001-intro-to-course.mp4","002-how-to-get-free-live-help.mp4"},R.color.yellow,R.drawable.ic_ghost);
        addItem("basics-of-sketch",new String[]{"004-sketch-ui-overview.mp4","005-designing-your-first-app-in-sketch.mp4","006-basics-of-layers-in-sketch.mp4","007-understanding-shapes-in-sketch.mp4","008-masking-proportional-scaling-in-sketch.mp4","009-styling-in-sketch-part-1.mp4","010-styling-in-sketch-part-2.mp4","011-working-with-images-in-sketch.mp4","012-typography-text-in-sketch.mp4","013-symbols-in-sketch.mp4","014-designing-an-instagram-profile-page-in-sketch.mp4","015-how-to-export-graphics-in-sketch.mp4"},R.color.blue,R.drawable.ic_ghost);
        addItem("advancing-your-skills-designing-a-chat-app",new String[]{"018-intro-to-app.mp4","019-creating-the-signup-login-screen-in-sketch.mp4","020-creating-the-inbox-in-sketch.mp4","021-new-messages-ui-in-sketch.mp4","022-creating-the-chat-ui-in-sketch.mp4","023-creating-the-settings-screen-in-sketch.mp4"},R.color.green,R.drawable.ic_ghost);
        addItem("designing-an-app-with-requirements-globetrotter",new String[]{"025-intro-to-app.mp4","026-creating-the-login-screen-in-sketch.mp4","027-creating-the-email-signup-ui-in-sketch.mp4","028-designing-the-home-screen.mp4","029-creating-the-post-screen-in-sketch.mp4"},R.color.pink,R.drawable.ic_ghost);


    }


    public void addItem(String title, String[] subItems, int colorRes, int iconRes ) {



        for (int index =0; index < subItems.length; index++){

            subItems[index] = subItems[index].replace(".mp4","");
            subItems[index] = subItems[index].replace("\\","");
//            subItems[index] = subItems[index].replace("0","");
//            subItems[index] = subItems[index].replace("1","");
//            subItems[index] = subItems[index].replace("2","");
//            subItems[index] = subItems[index].replace("3","");
//            subItems[index] = subItems[index].replace("4","");
//            subItems[index] = subItems[index].replace("5","");
//            subItems[index] = subItems[index].replace("6","");
//            subItems[index] = subItems[index].replace("7","");
//            subItems[index] = subItems[index].replace("8","");
//            subItems[index] = subItems[index].replace("9","");
        }
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
                String course = "sketch-design";
                String finaltital = text.replaceAll(" ","%20");
                String finalsubitem = subTitle.toString().replaceAll(" ","%20");
                String subitem = subTitle.toString();

                startActivity(new Intent(SketchActivity.this , VideoStreamingActivity.class).putExtra("real",subitem).putExtra("amit",finaltital).putExtra("bera",finalsubitem).putExtra("app",course));

                //Toast.makeText(getApplicationContext(),subitem,Toast.LENGTH_SHORT).show();
                //.putExtra("title",title).putExtra("folder",subitem));
            }
        });
    }




}
