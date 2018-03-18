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


public class KotlinActivity extends Activity {
    private ExpandingList mExpandingList;
    interface OnItemCreated {
        void itemCreated(String title);
    }
    public String aamit;
    private ExpandingItem mExpandedItem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kotlin);
        mExpandingList = (ExpandingList) findViewById(R.id.expanding_list_main);
        createItems();


    }

    private void createItems() {
        addItem("Android Studio and First App",new String[]{"Intro to Kotlin and Android Course.mp4","Get Free Live Help.mp4","First look at Kotlin.mp4","Install JDK and Android Studio for Mac.mp4","Install JDK and Android Studio for Windows.mp4","Android Emulator.mp4","DinnerDecider Part 1.mp4","DinnerDecider Part 2.mp4","DinnerDecider Part 3.mp4","Run on a real device!.mp4","Run on a real device from Windows!.mp4"},R.color.pink,R.drawable.ic_ghost);
        addItem("Kotlin Foundation",new String[]{"Installing IntellijIDEA for Mac.mp4","Installing IntellijIDEA for Windows.mp4","Variables with Kotlin.mp4","Strings with Kotlin.mp4","Numbers and Operators with Kotlin.mp4","Functions with Kotlin.mp4","Conditional Logic with Kotlin.mp4","Collections with Kotlin.mp4","Loops with Kotlin.mp4","Nullability with Kotlin.mp4","Classes and Inheritance with Kotlin.mp4","Lambda with Kotlin.mp4"},R.color.orange,R.drawable.ic_ghost);
        addItem("Terminal & Version Control",new String[]{"Intro to Git and Terminal.mp4","Git & Version Control - The Fun Way.mp4","Terminal Basics - Changing directories.mp4","Terminal Basics - Creating directories & files.mp4","Terminal Basics - copying & renaming files.mp4","Terminal Basics - deleting files & directories.mp4","Git Basics.mp4","Setting up Github.mp4","Working with Local & Remote Repositories.mp4","Handling Git Merge Conflicts.mp4","Using Git with Android Studio.mp4","Importing Projects and Merge Conflicts.mp4"},R.color.purple,R.drawable.ic_ghost);
        addItem("All About Layout",new String[]{"Intro to Android Constraint Layout.mp4","Phone Portrait Layout Part 1.mp4","Phone Portrait Layout Part 2.mp4","Tablet Portrait Layout.mp4","Tablet Landscape.mp4"},R.color.yellow,R.drawable.ic_ghost);
        addItem("Activity Lifecycle",new String[]{"Intro to the app.mp4","Welcome Screen Layout.mp4","League Selection Layout.mp4","Intents and Context.mp4","Lifecycle Overview.mp4","Lifecycle in action.mp4","Skill Selection Layout.mp4","Buttoning up the Activities.mp4","Toggling the skills.mp4","Parcelable.mp4","Instance State.mp4","Swoosh Challenge.mp4"},R.color.blue,R.drawable.ic_ghost);
        addItem("List and Recycler Views",new String[]{"CoderSwag Intro.mp4","Data Structure.mp4","Simple ListView.mp4","Custom List Adapter.mp4","View Holder.mp4","RecyclerView Adapter.mp4","Product List View.mp4","Product Recycle Adapter.mp4"},R.color.green,R.drawable.ic_ghost);
        addItem("Smack Chat App",new String[]{"Smack Intro.mp4","Project Setup.mp4","MainActivity UI Setup.mp4","Login Activity UI.mp4","CreateUserActivity UI.mp4","Generate Avatar and Background Color.mp4","Webrequests and APIs.mp4","Hosting API.mp4","Local Hosting API.mp4","Our first web request.mp4","Registering a user.mp4","Login User.mp4","Creating User.mp4","Polishing up Create User Activity.mp4","Broadcast Receiver.mp4","Find User.mp4","Polishing up the Login Activity.mp4","Add Channel Dialog.mp4","Sockets.mp4","Socket_On.mp4","Downloading Channels.mp4","Shared Preferences.mp4","Channel Selection.mp4","Send and receive message.mp4","Downloading Messages.mp4","Displaying Messages.mp4","Date Formatter.mp4"},R.color.yellow,R.drawable.ic_ghost);
        addItem("Publishing Your App",new String[]{"Intro to Section - Google Play Store.mp4","Side Loading.mp4","Registering Account.mp4","Removing Logs.mp4","Generate Signed APK.mp4","Store Listing.mp4","Published!.mp4"},R.color.pink,R.drawable.ic_ghost);


    }


    public void addItem(String title, String[] subItems, int colorRes, int iconRes ) {
        for (int index =0; index < subItems.length; index++){

            subItems[index] = subItems[index].replace(".mp4","");}
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
                String course = "android-kotlin";
                String finaltital = text.replaceAll(" ","%20");
                String finalsubitem = subTitle.toString().replaceAll(" ","%20");
                String subitem = subTitle.toString();

                startActivity(new Intent(KotlinActivity.this , VideoStreamingActivity.class).putExtra("real",subitem).putExtra("amit",finaltital).putExtra("bera",finalsubitem).putExtra("app",course));

                //Toast.makeText(getApplicationContext(),subitem,Toast.LENGTH_SHORT).show();
                //.putExtra("title",title).putExtra("folder",subitem));
            }
        });
    }




}
