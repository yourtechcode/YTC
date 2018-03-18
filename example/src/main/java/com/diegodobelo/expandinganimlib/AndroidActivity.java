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
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.diegodobelo.expandingview.ExpandingItem;
import com.diegodobelo.expandingview.ExpandingList;
import com.example.videoplayback.VideoStreamingActivity;

public class AndroidActivity extends Activity {
    private ExpandingList mExpandingList;
    interface OnItemCreated {
        void itemCreated(String title);
    }
    public String aamit;
    private ExpandingItem mExpandedItem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_android);
        mExpandingList = (ExpandingList) findViewById(R.id.expanding_list_main);
        createItems();


    }

    private void createItems() {
        addItem("Set up for Android Development",new String[]{"How the Course is Structured.mp4","Developing for Android - Tools for this Course","Setup on Mac Android Studio the JDK & Connecting a Physical Device","Setup on Windows Android Studio the JDK & Connecting a Physical Device","Configure Android Studio for Productivity Themes Auto-Import & SDKs","How to Set Up an Android Emulator with Hardware Acceleration","Slow PC Make it Run Faster with these Performance Tricks [Windows]"},R.color.pink,R.drawable.ic_ghost);
        addItem("Build the I am Rich App to learn about project structure and XML",new String[]{"What are we going to build.mp4","Creating a New Android Studio Project and Choosing the API Level","Working with the Layout Editor_ Strings_ and App Themes","Adding Graphics to a Project and using ImageViews","What is XML and How Does it Work","Setting a Custom Launcher Icon","Running the App to Test it Out!","Design the App's Screen in the Layout XML ","Understand the Android Project Structure ","The Wonderful World of Version Control_ Installing Git"},R.color.blue,R.drawable.ic_ghost);
        addItem("Coding Challenge 1",new String[]{"What are the Coding Challenges","What You Will Create","Import the Project from GitHub and Open it in Android Studio","How to Submit Your Assignment on Github [Optional]","I am Poor Challenge Solution"},R.color.green,R.drawable.ic_ghost);
        addItem("Build a Dice App to Learn Java & XML Fundamentals",new String[]{"What Will We Make.mp4","Start a New Project and Style the App with the Theme Editor.mp4","Generating App Icons and Adding Graphics to a Project","Designing a Screen with Nested Layouts.mp4","Using Variables and Linking Layout Elements to Java Code.mp4","Use the Logcat and a Listener to Check if a Button is Pressed.mp4","Create Random Numbers in Java.mp4","Java Arrays and How to Use Them.mp4","Debugging Practice Compilation and Build Errors.mp4","Debugging Practice The App Has Stopped What to do after a Crash.mp4"},R.color.purple,R.drawable.ic_ghost);
        addItem("Coding Challenge 2",new String[]{"What You Will Create.mp4","Import the Skeleton Project from Github.mp4","Submit Your Coursework [Optional].mp4","Magic 8 Ball Challenge Solution.mp4"},R.color.pink,R.drawable.ic_ghost);
        addItem("Java Programming for Beginners",new String[]{"Introduction to the Programming Modules.mp4","Setting up a Pure Java Project in Android Studio.mp4","Code Blocks_ the main() Method_ and Code Compilation Explained .mp4","Comments_ Variables and Types .mp4","Methods Part 1 - Defining and Calling a Method .mp4","Methods Part 2 - Adding Parameters .mp4","Methods Part 3 - Multiple Parameters and Returning a Value .mp4","Control Flow_ Conditional Statements (IF_ELSE) .mp4"},R.color.orange,R.drawable.ic_ghost);
        addItem("Build a Music App [Tutorial]",new String[]{"What Will We Make_.mp4","Setting Up the Project & Using Colours as Resources.mp4","How to Use Android Documentation and Other Resources.mp4","Calling the Constructor to Create a SoundPool.mp4","Member Variables and the Importance of Scope .mp4","Using the onClick Property instead of a Listener.mp4","How to Play a Sound in Your App using the SoundPool.mp4"},R.color.green,R.drawable.ic_ghost);
        addItem("Build a Quiz App and Learn about the MVC Design Pattern [Tutorial]",new String[]{"What Will We Make_.mp4","Import & Familiarise Yourself with the Skeleton Project.mp4","Understand Casting & Link the Layout to the Java Code.mp4","Set an OnClickListener & Implement a Toast Message.mp4","Create the Model Class & Generate Code with Android Studio.mp4","The Model View Controller (MVC) Design Pattern and Why We Use It.mp4","Retrieve Quiz Questions from an Array and Display them on Screen.mp4","Update Questions on Screen and Interpret Errors in the Logcat.mp4","Check the User's Answer and Give Feedback.mp4","Working with the Progress Bar and Tracking Score.mp4","Fixing the Screen Orientation and Displaying an AlertDialog.mp4","An Overview of How an Android App Works.mp4","The Activity Lifecycle .mp4","Saving State using the Bundle and Null Pointer Exceptions.mp4"},R.color.yellow,R.drawable.ic_ghost);
        addItem("Coding Challenge 3 ",new String[]{"What You'll Create.mp4","Destini Challenge Solution.mp4"},R.color.green,R.drawable.ic_ghost);
        addItem("Working with the Constraint Layout & Creating Multiple Layouts",new String[]{"Converting to a Constraint Layout & Designing for Multiple Screens.mp4","Setting Constraints and Using Built-In Styles.mp4","Linking Views to Each Other.mp4","Using Guidelines to Position Layout Elements.mp4","Automatically Inferring Constraints with Android Studio.mp4","Resource Qualifiers and Layouts for Landscape Mode.mp4","Internationalisation_ Resource Qualifiers and the Translations Editor.mp4","Creating a Landscape Layout and Adding Content Descriptions for Accessibility.mp4"},R.color.purple,R.drawable.ic_ghost);
        addItem("Java Programming for Intermediates",new String[]{"Set up a Standard Java Project in Android Studio.mp4","Virtual Machines & Program Entry Points_ main() vs the Android Intent Filter  .mp4","Classes and Objects Demystified .mp4","Fields_ the Dot Notation_ and an Object's State .mp4","Using Getters_Setters & Access Modifiers_ Public v_s_ Private .mp4","No-Argument Constructors v_s_ Parameterised Constructors .mp4","Object Behaviour & Using Methods .mp4","The static Keyword_ Class Variables & Class Methods .mp4","Inheritance_ the protected Modifier & the @Override Annotation .mp4"},R.color.orange,R.drawable.ic_ghost);
        addItem("Build a Weather App - Use GPS and APIs to Get Data from the Web [Tutorial]",new String[]{"What Will We Make_.mp4","Project Setup & Overview.mp4","Gradle Project & Module Scripts and Android SDK Compatibility.mp4","Adding External Libraries as Dependencies with Gradle.mp4","Manage App Permissions in the Android Manifest.mp4","Runtime Permissions & Using the LocationManager to Get Your Location.mp4","Networking_ HTTP Requests_ Status Codes & APIs.mp4","Making the HTTP Request for Weather Data.mp4","The JSON Format Explained .mp4","Parse the JSON and Handle Exceptions with a Try-Catch Block.mp4","Update the UI and Show the Weather to the User.mp4","Create a New Activity and Link Activity & Layout.mp4","Using Intents to Navigate Between Activities.mp4","Intent Extras and EditText onEditorAction() Callbacks.mp4","API Call with a City Name_ the Logical NOT and Freeing Up Resources.mp4"},R.color.pink,R.drawable.ic_ghost);
        addItem("Coding Challenge 4 ",new String[]{"What You Will Create.mp4","Bitcoin Ticker Challenge Solution.mp4"},R.color.orange,R.drawable.ic_ghost);
        addItem("Build a WhatsApp Clone and learn to use Cloud Data Storage [Tutorial]",new String[]{"What Will We Make_.mp4","Project Tour and Overview of Existing Code.mp4","What is Firebase_ .mp4","Create a New Project on Firebase and Configure the Android App.mp4","Registering New Users_ Validating Data & the Builder Design Pattern.mp4","Storing Data Locally (on Device) using SharedPreferences.mp4","Handling User Login with FirebaseAuth.mp4","Retrieve the Locally Stored Data.mp4","Create the Model Class & Save Data to the Cloud.mp4","ListViews_ Adapters & ArrayLists.mp4","Implementing the ViewHolder Pattern.mp4","Retrieve Data from Firebase with a ChildEventListener.mp4","Styling Views with 9 Patch Images.mp4"},R.color.blue,R.drawable.ic_ghost);
        
    }

    
    public void addItem(String title, String[] subItems, int colorRes, int iconRes ) {

        for (int index =0; index < subItems.length; index++){

            subItems[index] = subItems[index].replace(".mp4","");



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
                String course = "android-java";
                String finaltital = text.replaceAll(" ","%20");
                String finalsubitem = subTitle.toString().replaceAll(" ","%20");
                String subitem = subTitle.toString();

                startActivity(new Intent(AndroidActivity.this , VideoStreamingActivity.class).putExtra("real",subitem).putExtra("amit",finaltital).putExtra("bera",finalsubitem).putExtra("app",course));

                //Toast.makeText(getApplicationContext(),subitem,Toast.LENGTH_SHORT).show();
                //.putExtra("title",title).putExtra("folder",subitem));
            }
        });
    }




}
