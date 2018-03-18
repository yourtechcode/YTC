package com.diegodobelo.expandinganimlib;

import android.app.Activity;

import android.content.Intent;

import android.os.Bundle;
import android.view.View;

import android.widget.TextView;


import com.diegodobelo.expandingview.ExpandingItem;
import com.diegodobelo.expandingview.ExpandingList;
import com.example.videoplayback.VideoStreamingActivity;


public class ReactActivity extends Activity {
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
        addItem("Getting Started",new String[]{"Welcome.mp4","What is React Native.mp4","A Closer Look.mp4","What Happens to JavaScript.mp4","Creating Our First React Native App.mp4","Dealing with Limitations of React Native.mp4","What a Good Course Offers.mp4","Course Requirements.mp4","Course Outline.mp4","How to get the Most out of This Course.mp4"},R.color.pink,R.drawable.ic_ghost);
        addItem("Diving into the Basics",new String[]{"Module Introduction.mp4","Creating a New Project.mp4","JSX Elements you Can and Cant Use.mp4","Ejecting from Create React Native App.mp4","Running the App on an Android Simulator Setup.mp4","Running our App on a Real Android Device.mp4","Running our App on an iOS Simulator.mp4","Running our App on an iOS Device.mp4","A Good Development Setup.mp4","Working on the App Adding a Textinput.mp4","Styling - Understanding the Basics.mp4","Positioning Elements with Flexbox.mp4","Adding a Button and Managing State.mp4","Creating a Custom Component.mp4","Listening to Touch Events.mp4","Reacting to Press Events.mp4","Using a ScrollView.mp4","Rendering Lists Correctly.mp4","Adding Static Images.mp4","Using Network Images.mp4","Adding a Modal.mp4","React vs React Native.mp4","JavaScript - Supported Features.mp4","Wrap Up.mp4"},R.color.yellow,R.drawable.ic_ghost);
        addItem("Using Redux with React Native",new String[]{"Module Introduction.mp4","A Brief Redux Refresher.mp4","Installing Redux and Creating a Basic Setup.mp4","Setting Up Actions.mp4","Setting Up the Reducer.mp4","Creating the Store.mp4","Connecting React Native to Redux.mp4","Wrap Up.mp4"},R.color.green,R.drawable.ic_ghost);
        addItem("Debugging React Native Apps",new String[]{"Module Introduction.mp4","Using the Remote JavaScript Debugging console.log.mp4","Debugging with Breakpoints.mp4","Debugging with React Native Debugger.mp4","Debugging Redux.mp4","Wrap Up.mp4"},R.color.yellow,R.drawable.ic_ghost );
        addItem("Linking and Using Third Party Libraries",new String[]{"Module Introduction.mp4","Installing Libraries.mp4","Linking Libraries on iOS.mp4","Linking Libraries on Android.mp4","Using Library Features Adding Icons.mp4","Wrap Up.mp4"},R.color.blue,R.drawable.ic_ghost);
        addItem("Navigation in React Native Apps",new String[]{"Module Introduction.mp4","Navigation in Web Apps vs Native Apps.mp4","Exploring Native Navigation Solutions.mp4","Adding React Native Navigation to iOS.mp4","Adding React Native Navigation to Android.mp4","Finishing the Library Setup.mp4","Registering and Rendering a Screen.mp4","Adding a Tabs Screen Tabs Navigation.mp4","Adding Icons to Tabs.mp4","Connecting Screens to Redux.mp4","Updating Redux.mp4","Pushing Pages Navigating Forwards.mp4","Popping Pages Navigating Backwards.mp4","More Navigator Methods.mp4","Adding a Side Drawer.mp4","Using Navigation Events Toggling the Drawer.mp4","Finishing the Drawer.mp4","Wrap Up.mp4"},R.color.orange,R.drawable.ic_ghost);
        addItem("Styling Animating React Native Apps Correctly",new String[]{"Module Introduction.mp4","Using StyleSheet vs Normal JS Objects.mp4","Vanilla CS vs React Native Styles.mp4","Flexbox in Action.mp4","Styling with Relative Units.mp4","Global Styles with Custom Components.mp4","Synthetic Cascading of Styles.mp4","Styling Text.mp4","Cascading Text Styles.mp4","Adding a Background Image.mp4","Creating a Re-Usable Custom Button.mp4","Editing the Share Place Screen.mp4","Styling Splitting the Share Place Screen.mp4","Finishing the Share Place Screen.mp4","Your Challenge.mp4","Styling the Side Drawer.mp4","Quick Bug Fix PlaceInput Component.mp4","Intro Cross Platform Styles Responsiveness.mp4","Cross-Platform Styling Made Easy.mp4","Using the Platform API.mp4","Loading Different Icons for Different Platforms.mp4","Using Different Entry Points into the App.mp4","Cross-Platform UI Libraries.mp4","The Responsive Styling Problem.mp4","Responsive Design Solutions.mp4","Using the Dimensions API.mp4","Adjusting Styles Dynamically to changing Width Height.mp4","A Better Responsive Solution.mp4","Bug Fix Centering with Margins.mp4","Cleaning Up Dimensions Listeners.mp4","Styling Navigation Items react-native-navigation.mp4","Preparing the App for Animations.mp4","Using the Animated API.mp4","Animations Summary.mp4","Wrap Up.mp4"},R.color.green,R.drawable.ic_ghost);
        addItem("Handling User Input",new String[]{"Module Introduction.mp4","Managing Input Control State.mp4","Adding Custom Validation Logic.mp4","Using the Validation State.mp4","Dispatching an Auth Action.mp4","Switching Form Auth Modes.mp4","Configuring Text Input Components.mp4","Handling the Soft Keyboard.mp4","Wrap Up.mp4"},R.color.purple,R.drawable.ic_ghost);
        addItem("Using Native Device",new String[]{"Module Introduction.mp4","Installing react-native-maps.mp4","Rendering a Map.mp4","Picking a Location on the Map.mp4","Adding a Map Marker.mp4","Animating Map Movement.mp4","Locating the User.mp4","Storing the Picked Location with Redux.mp4","Installing react-native-image-picker.mp4","Using the Image Picker.mp4","Storing the Picked Images.mp4","Image Picker and the Data it Returns.mp4","Wrap Up.mp4"},R.color.pink,R.drawable.ic_ghost);
        addItem("Networking",new String[]{"Module Introduction.mp4","Sending Http Requests - Theory.mp4","Creating the Server.mp4","Using the Fetch-API.mp4","Storing Data in Firebase.mp4","Storing Images.mp4","Finishing the Image Upload Function.mp4","Storing the Remaining Data.mp4","Adding the Activity Indicator.mp4","Handling Errors.mp4","Getting Data from the Server.mp4","Fixing an Error.mp4","Wrap Up.mp4"},R.color.yellow,R.drawable.ic_ghost);
        addItem("Authentication in React Native Apps",new String[]{"Module Introduction.mp4","How Authentication Works in React Native Apps.mp4","Enabling Firebase Authentication.mp4","Signing Users Up.mp4","Using\\ the\\ Authentication\\ Result\\ Response.mp4","163\\ Supporting\\ Signup\\ and\\ Login.mp4","164\\ Adding\\ User\\ Login.mp4","165\\ Protecting\\ Routes\\ on\\ Firebase.mp4","Storing\\ the\\ Auth\\ Token\\ in\\ Redux.mp4","Using\\ the\\ Auth\\ Token.mp4","Fetching\\ the\\ Token\\ in\\ a\\ Re-Usable\\ Way.mp4","Protecting\\ the\\ Firebase\\ Cloudfunction.mp4","Adding\\ Places\\ Authenticated.mp4","Storing\\ the\\ Token\\ in\\ AsyncStorage.mp4","Adding\\ an\\ Auto-Signin\\ Functionality.mp4","Managing\\ the\\ Token\\ Expiration.mp4","Clearing\\ the\\ Auth\\ Storage\\ AsyncStorage.mp4","Refreshing\\ the\\ Token.mp4","Adding\\ User\\ Logout.mp4","Refreshing\\ the\\ Token\\ Without\\ App\\ Reloads.mp4","Wrap\\ Up.mp4"},R.color.purple,R.drawable.ic_ghost);
        addItem("Polishing the App",new String[]{"180\\Module\\ Introduction.mp4","181\\Identifying\\ Improvement\\ Potential.mp4","182\\Shrinking\\ Image\\ Sizes.mp4","183\\Resetting\\ the\\ Share\\ Place\\ Screen.mp4","184\\Redirecting\\ to\\ Another\\ Tab.mp4","185\\Loading\\ Places\\ All\\ The\\ Time.mp4","186\\Improving\\ Http\\ Error\\ Handling.mp4","187\\Cleaning\\ Stored\\ Images\\ on\\ Firebase.mp4","188\\Wrap\\ Up.mp4"},R.color.orange,R.drawable.ic_ghost);
        addItem("Publishing the App",new String[]{"189\\Module\\ Introduction.mp4","190\\Adding\\ Launcher\\ Icons.mp4","191\\Adding\\ a\\ Splash\\ Screen.mp4","192\\Configuring\\ Building\\ the\\ App.mp4","193\\Publishing\\ to\\ Google\\ Play\\ Store\\ Android.mp4","194\\Publishing\\ to\\ the\\ App\\ Store\\ iOS.mp4"},R.color.yellow,R.drawable.ic_ghost);
        addItem("Round Up",new String[]{"Course Roundup.mp4"},R.color.green,R.drawable.ic_ghost);


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
                String course = "reactnative";
                String finaltital = text.replaceAll(" ","%20");
                String finalsubitem = subTitle.toString().replaceAll(" ","%20");
                String subitem = subTitle.toString();

                startActivity(new Intent(ReactActivity.this , VideoStreamingActivity.class).putExtra("real",subitem).putExtra("amit",finaltital).putExtra("bera",finalsubitem).putExtra("app",course));

                //Toast.makeText(getApplicationContext(),subitem,Toast.LENGTH_SHORT).show();
                //.putExtra("title",title).putExtra("folder",subitem));
            }
        });
    }




}
