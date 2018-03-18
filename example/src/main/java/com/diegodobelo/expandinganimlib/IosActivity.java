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

public class IosActivity extends Activity {
    private ExpandingList mExpandingList;
    interface OnItemCreated {
        void itemCreated(String title);
    }

    private ExpandingItem mExpandedItem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ios);
        mExpandingList = (ExpandingList) findViewById(R.id.expanding_list_main);
        createItems();


    }

    private void createItems() {
        addItem("Getting Started",new String[]{"What you will get.mp4","Tools And Material.mp4","Download Xcode 9.mp4","A Walkthrough of the Xcode Development Environment.mp4","The Anatomy of an iOS App.mp4"},R.color.blue,R.drawable.ic_ghost);
        addItem("iOS Interface Builder",new String[]{"The I Am Rich App.mp4","How to Properly Create a New Xcode Project.mp4","Let's Design the User Interface Using Storyboards.mp4","How to Position User Interface (UI) Elements.mp4","How to Incorporate Image Assets into Your Xcode Project.mp4","What's the Difference Between Points and Pixels & How to Design iOS Image Assets.mp4","Run and Test Your App!.mp4"},R.color.orange,R.drawable.ic_ghost);
        addItem("Sideloading in iOS",new String[]{"What is Sideloading and How Can You Get Your App onto Your iPhone_.mp4","How to Sideload Your App using Xcode.mp4"},R.color.pink,R.drawable.ic_ghost);
        addItem("Coding Challenge 1",new String[]{"What are Coding Challenges_.mp4","What You Will Create by the End of this Challenge.mp4","What is GitHub and How to Download the Stub Projects.mp4"},R.color.purple,R.drawable.ic_ghost);
        addItem("Build a iOS Dice App to Learn Swift Programming Basics",new String[]{"What You'll Make by the End of This Module.mp4","How to Design Your App.mp4","Linking Design with Code.mp4","[Common Errors] IBOutlets_IBActions Debugging.mp4","How to Clean the Console in Xcode.mp4","How to Create Randomisation in Swift.mp4","Data Types_ Constants and Variables.mp4","Learn About Arrays in Swift and Programmatically Update the Display.mp4","[How to Become a Better Programmer] The DRY Principle.mp4","How to Add Motion Detection in to Your App.mp4"},R.color.yellow,R.drawable.ic_ghost);
        addItem("Coding Challenge 2",new String[]{"What You'll Build in this Coding Challenge.mp4","Magic 8 Ball Solution Walk Through.mp4"},R.color.yellow,R.drawable.ic_ghost);
        addItem("Programming in Swift 4 for Beginners [Using Swift Playgrounds]",new String[]{"Introduction to the Programming Modules.mp4","Comments_ Print Statements and Debug Console.mp4","Data Types_ Constants and Variables.mp4","Swift Functions_ Part 1 - The Simple Function.mp4","Swift Functions_ Part 2 - Functions with Inputs.mp4","Swift Functions Part 3 - Functions with Outputs.mp4","Control Flow with Conditional Statements in Swift (IF_ELSE).mp4","BMI Calculator Challenge Solution.mp4","Introduction to Loops in Swift - The For In loop.mp4","Using Loops in Your Program.mp4","A Brain Teaser with Loops and the Fibonacci Sequence.mp4"},R.color.green,R.drawable.ic_ghost);
        addItem("Apple iOS APIs - Make a Music App",new String[]{"What You'll Make by the End of This Module.mp4","How to Use Tags in the Storyboards.mp4","How to Use the Apple Documentation to Tap into Any iPhone Capability You Want.mp4","Incorporate AVFoundation to Play Sound.mp4","Error Catching in Swift 4 - Do_ Catch and Try.mp4","Create a Method to Contain the Sound Playing Functionality.mp4","[Common Swift Errors] _Index Out of Range_ and How to Debug it.mp4","Make the App Play a Different Sound for Each Button.mp4","The Importance of _Scope_ in Programming.mp4"},R.color.blue,R.drawable.ic_ghost);
        addItem("The Model-View-Controller (MVC) Design Pattern - Make a Quiz App",new String[]{"What You'll Make by the End of This Module.mp4","Set up the Project.mp4","Let's Create a Data Model.mp4","Object-Oriented Programming - What are Objects and Classes_.mp4","Creating the Question Bank Class.mp4","[ELI5] The Model View Controller (MVC) Design Pattern - Explain Like I'm 5.mp4","Initialise the First Question.mp4","How to Progress Through the Question Bank.mp4","[Debugging Practice] Using the Xcode Debug Console.mp4","How to Implement a UIAlertController and Show a Popup to the User.mp4","A High Level Overview of How Our App Works.mp4","How to Track Progress and Score.mp4","How to Incorporate Objective-C Code in to Swift.mp4"},R.color.purple,R.drawable.ic_ghost);
        addItem("Coding Challenge 3",new String[]{"What You'll Build in This Coding Challenge.mp4","Destini Solution Walk Through.mp4"},R.color.pink,R.drawable.ic_ghost);
        addItem("iOS Auto Layout and Setting Constraints",new String[]{"Why Do We Need Auto Layout_.mp4","Positioning UI Elements Programmatically.mp4","The Theory Behind Auto Layout.mp4","Auto Layout in Practice - Setting Constraints.mp4","Use What You Just Learnt to Practice Auto Layout.mp4","Auto Layout Challenge Solution.mp4","New! Auto Layout Using Stack Views.mp4"},R.color.orange,R.drawable.ic_ghost);
        addItem("Programming in Swift 4 for Intermediates",new String[]{"Classes and Objects.mp4","Creating a New Class from Scratch.mp4","Creating Enums in Swift.mp4","How to Create an Object from a Class.mp4","Class Initialization.mp4","Designated and Convenience Initializers.mp4","Creating a Method.mp4","Class Inheritance - The Theory.mp4","How to Override an Inherited Method.mp4","Class Inheritance - Putting it into Practice.mp4","What are Swift Optionals_!_!.mp4","Optionals Explained.mp4"},R.color.purple,R.drawable.ic_ghost);
        addItem("Cocoapods_ GPS_ APIs_ REST and Getting Web Content -  Weather App",new String[]{"What You'll Make by the End of This Module.mp4","Setting up the Skeleton Project.mp4","What are Cocoapods and Why Do We Need Them_.mp4","Install and Setup Cocoapods on Your System.mp4","Troubleshooting Cocoapods Installation.mp4","Installing New Pods in Your Xcode Project.mp4","Fix for Those with a Version of Cocoapods Below 1_0_1.mp4","Completing the Pod Installation Process.mp4","Setting up the Location Manager to Get GPS Data from the iPhone.mp4","Asking the User for Location Permissions.mp4","Tapping into the GPS.mp4","What is Delegation_.mp4","Swift Dictionaries.mp4","What are APIs_.mp4","Networking with Alamofire.mp4","Networking & REST Explained.mp4","What is JSON and How to Parse it.mp4","Create a Weather Data Model.mp4","Update the User Interface.mp4","Creating and Using Segues in Xcode.mp4","Using Delegates and Protocols in iOS App Development.mp4","How to Pass Data Between View Controllers.mp4","Delegates and Protocols Explained.mp4","Request Weather Data Based on City Name.mp4"},R.color.yellow,R.drawable.ic_ghost);
        addItem("The Command Line and Terminal",new String[]{"Introduction to the Command Line.mp4","Command Line Shortcuts.mp4","Directory and File Manipulation Using the Command Line + Bonus.mp4"},R.color.blue,R.drawable.ic_ghost);
        addItem("Coding Challenge 4",new String[]{"What You'll Build by the End of This Coding Challenge.mp4","Optional Bitcoin Challenge Solution.mp4"},R.color.purple,R.drawable.ic_ghost);
        addItem("Cloud Database",new String[]{"What You Will Make.mp4","What is Firebase.mp4","Register for an Account on Firebase.mp4","Set Up Firebase for Development.mp4","Saving Data to Firebase.mp4","Let's Register Some Users to our App.mp4","Swift Closures [Advanced Swift].mp4","The Event-Driven Nature of Apps.mp4","What are Completion Handlers and How Do They Work.mp4","How Do Navigation Controllers Work and How do You Create Them_.mp4","Let's Code Up the Login Screen.mp4","What are TableViews and How to Set One Up_.mp4","Making a Custom Message Class.mp4","Learn About UI Animations in iOS and Make Our Own.mp4","Let's Send Some Messages!.mp4","Observing for Database Changes.mp4","Bug Fix - Where's the Historical Message Data_ .mp4","Update the Security Setting of Your Database.mp4","Let's Improve the UX - Add a Progress Spinner.mp4","Improving the UI - Differentiating Between Different Users.mp4"},R.color.green,R.drawable.ic_ghost);
        addItem("Git GitHub and Version Control",new String[]{"Introduction to Version Control and Git.mp4","Version Control Using Git and the Command Line.mp4","GitHub and Remote Repositories.mp4","Gitignore.mp4","Cloning.mp4","Branching and Merging.mp4","Using Git and GitHub in Xcode 9.mp4","Forking and Pull Requests.mp4"},R.color.orange,R.drawable.ic_ghost);
        addItem("Introduction to Machine Learning",new String[]{"Introduction to Machine Learning.mp4","Supervised Learning.mp4","Unsupervised Learning.mp4","Reinforcement Learning.mp4"},R.color.blue,R.drawable.ic_ghost);
        addItem("iOS 11 - CoreML",new String[]{"What is CoreML.mp4","What we'll be making.mp4","How to Import the Image Recognition Model & Enable Camera Functionality.mp4","Getting Image Recognition Results Back from Our V3 Model.mp4","Hotdog or Not Hotdog.mp4"},R.color.yellow,R.drawable.ic_ghost);
        addItem("Machine Learning Using IBM Watson",new String[]{"What You'll Make by the End of This Module.mp4","How to Install and Use Carthage as a Dependency Manager.mp4","How to Implement the Camera and Photo Library Functionality in iOS.mp4","How Use A Pre-Trained Neural Net from IBM to Classify Any Image.mp4","How to Process the Data You Get Back from IBM Bluemix.mp4","Let's Beautify Our App and Make it Look Like the Real Deal.mp4"},R.color.pink,R.drawable.ic_ghost);
        addItem("iOS 11 - Advanced CoreML",new String[]{"What we'll be making.mp4","Installing CoremlTools using Python PIP.mp4","Converting a Caffe Model into MLModel.mp4","Set up a UIImagePickerController.mp4","Setting up a UIImagePickerController.mp4","Getting Classifications from Our Model.mp4","Getting Classifications from our Model.mp4","Adding Cocoapods to Our Project.mp4","Making HTTP GET requests to Wikipedia using Alamofire and REST.mp4","Parsing the JSON Result using SwiftyJSON.mp4","[Solution] Parsing the JSON Result using SwiftyJSON.mp4","Displaying Images From a URL using SDWebImage.mp4"},R.color.purple,R.drawable.ic_ghost);
        addItem("iOS 11 - ARKit",new String[]{"Introduction to Augmented Reality and ARKit.mp4","How to Setup and Configure Your Project for AR.mp4","How to Create a 3D Object in Augmented Reality.mp4","Bring the Moon into Your Living Room Using AR.mp4","How to Find and Import 3D Models for AR.mp4","How to Detect Horizontal Planes in the Real World.mp4","How to Detect Touch on Real World 3D Objects.mp4","How to Place Our Dice in 3D Using Touch.mp4","How to Animate 3D Objects in AR.mp4","How to Animate and Roll all the 3D Dice at Once.mp4","How to Remove Our 3D Objects from the AR Scene.mp4","[Optional Lesson] Refactoring Our Code for Better Readability.mp4"},R.color.orange,R.drawable.ic_ghost);
        addItem("iOS 11 - Advanced ARKit",new String[]{"What We'll Make By the End of This Module.mp4","Adding the Start and End Measuring Points in 3D.mp4","Measuring the Distance in AR.mp4","Creating 3D Text to Display in AR.mp4","Enabling New Measurements.mp4"},R.color.blue,R.drawable.ic_ghost);
        addItem("How to Submit Your App to the App Store",new String[]{"How to Publish Your App on to the App Store.mp4","Useful Tools to Help You with App Submissions.mp4"},R.color.pink,R.drawable.ic_ghost);

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
                String course = "ios11";
                String finaltital = text.replaceAll(" ","%20");
                String finalsubitem = subTitle.toString().replaceAll(" ","%20");
                String subitem = subTitle.toString();

                startActivity(new Intent(IosActivity.this , VideoStreamingActivity.class).putExtra("real",subitem).putExtra("amit",finaltital).putExtra("bera",finalsubitem).putExtra("app",course));

                //Toast.makeText(getApplicationContext(),subitem,Toast.LENGTH_SHORT).show();
                //.putExtra("title",title).putExtra("folder",subitem));
            }
        });
    }




}
