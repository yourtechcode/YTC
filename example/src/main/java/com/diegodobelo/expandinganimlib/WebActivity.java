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



public class WebActivity extends Activity {
    private ExpandingList mExpandingList;
    interface OnItemCreated {
        void itemCreated(String title);
    }
    public String aamit;
    private ExpandingItem mExpandedItem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);
        mExpandingList = (ExpandingList) findViewById(R.id.expanding_list_main);
        createItems();


    }

    private void createItems() {
        addItem("Getting Started With HTML", new String[]{"Intro to Web Development","Where to get free live help","Installing an IDE","HTML Building Your First Website","Intro to HTML HEAD BODY and HEADER","HTML Lists Paragraphs and Text Styling","HTML Displaying Data With Tables","HTML Images  Forms"}, R.color.pink, R.drawable.ic_ghost);
        addItem("Introduction to CSS",new String[]{"What is CSS","How to use Inline Internal and External CSS","CSS Element ID  Class Selectors","CSS Colors","CSS Backgrounds  Borders","Using browser inspector tools","CSS Combinators","CSS Grouping","CSS Specificity"},R.color.green,R.drawable.ic_ghost);
        addItem("Intermediate CSS",new String[]{"CSS Text Styling  Formatting","CSS Google Fonts","CSS Images","CSS Padding  Margin","CSS Rows  Columns"},R.color.yellow,R.drawable.ic_ghost);
        addItem("Advanced CSS Building and styling website",new String[]{"CSS Intro to building your first Website","CSS Building the Navbar","CSS Making the Navbar Mobile Responsive - Part 1","CSS Making the Navbar Mobile Responsive - Part 2","CSS Creating the Form Group","CSS Working with iframes","CSS Working with images and box shadows","CSS Working with text and image spacing","CSS Building the footer"},R.color.purple,R.drawable.ic_ghost);
        addItem("Learning to Code With Javascript",new String[]{"Time to Javascript","Javascript Reference","Javascript Comments  How to Link Scripts","Javascript Variables  Strings","Javascript Numbers","Javascript Comparison Operators","Javascript Logical Operators","Javascript Arrays","Javascript Loops","Javascript Functions","Javascript Objects","Javascript Bind","Percentage Calculator - Setting Up the Form","Percentage Calculator - Grabbing Elements With Javascript","Percentage Calculator - Using Event Listeners","Percentage Calculator - Algorithm  Prevent Default"},R.color.orange,R.drawable.ic_ghost);
        addItem("Version Control With Git",new String[]{"How Version Control Works","macOS Terminal Basics","Git Basics","Setting up Github on macOS","Github vs Bitbucket","Local  Remote Repositories","Working Through Git Merge Conflicts"},R.color.blue,R.drawable.ic_ghost);
        addItem("Introduction to Bootstrap 4",new String[]{"What is Bootstrap 4","Downloading Bootstrap 4","Bootstrap 4 Project Setup","Bootstrap 4 Overview of Bootstraps Components","Bootstrap 4 Understanding  Bootstraps Classes","Bootstrap 4 Using the Grid System"},R.color.pink,R.drawable.ic_ghost);
        addItem("Bootstrap 4 Creating a Login Portal",new String[]{"Bootstrap 4 Cards Creating the Sign-in Portal Box","Bootstrap 4 Forms Adding the input fields","Bootstrap 4 Buttons Adding the Sign In button and Labels","Bootstrap 4 Grids - Finishing Mobile Compatibility"},R.color.orange,R.drawable.ic_ghost);
        addItem("Bootstrap 4 Skate or Die Website",new String[]{"Bootstrap 4 Skate or Die Intro","Bootstrap 4 Working with Navbars","Bootstrap 4 Using Carousels","Bootstrap 4 Nesting rows and columns","Bootstrap 4 Modals","Bootstrap 4 Adding images and buttons","Bootstrap 4 Sizing Modals","Bootstrap 4 Building the Footer","Bootstrap 4 Working with Font Awesome Favicons"},R.color.purple,R.drawable.ic_ghost);
        addItem("Beginner Sass",new String[]{"Intro to Sass","What is Sass","How to install Sass and compile it to CSS","Your FIRST Sass Website","Different tools to compile Sass","How to structure your Sass","Sass Partials Maintainable Styles Rules","Sass Variables and Imports Create a clean Scalable Stylesheet","Sass Mixins Save time  recycle styles","Sass Extends Share style properties between other selectors","Final Project Intro to our Landing Page","Final Project Setting up our Variables","Final Project Styling our Navbar with Sass","Final Project Creating the Banner Container","Final Project Adding Content to our Banner Container","Final Project Doing some quick cleanup in our Sass files","Final Project Using the Extend method","Final Project Styling a section splitter with Sass","Final Project Using advanced Mixins","Final Project Styling the next Container with Sass","Final Project Finishing our Landing Page Congrats"},R.color.pink,R.drawable.ic_ghost);
        addItem("Intro to Node Mongo  REST APIs",new String[]{"Understanding Web Requests","Installing Node on macOS","All About JSON","Basics of Node","Node Modules","Building Your First API","Postman GET  POST Requests","URL Parameters  Delete Requests","Installing MongoDB on macOS","Working With the Mongo Shell","Searching for Documents","Deletions  Documentation","Swag Shop API Project Creation","Swag Shop API Creating the Models","Swag Shop API Posting Products","Swag Shop API Fetching Products","Swag Shop API Populating Data"},R.color.green,R.drawable.ic_ghost);
        addItem("Intro to React",new String[]{"Swag Shop Setting Up React Tooling","Swag Shop Installing Bootstrap","Swag Shop Setting Up the API","Swag Shop Creating a HTTP Service","Swag Shop Promises With ES6  React","Swag Shop Components in React - Website Product","Swag Shop Props in React","Swag Shop Working With State in React","Swag Shop Creating a WishList Component","Swag Shop Building a Singleton Data Service","Swag Shop Creating a Notification Service","Swag Shop Posting Notifications to React Components","Swag Shop Observing Notifications in React","Swag Shop Finishing Our Full Stack React App"},R.color.blue,R.drawable.ic_ghost);




    }


    public void addItem(String title, String[] subItems, int colorRes, int iconRes ) {
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
                String course = "ultimateweb";
                String finaltital = text.replaceAll(" ","%20");
                String finalsubitem = subTitle.toString().replaceAll(" ","%20");
                String subitem = subTitle.toString();

                startActivity(new Intent(WebActivity.this , VideoStreamingActivity.class).putExtra("real",subitem).putExtra("amit",finaltital).putExtra("bera",finalsubitem).putExtra("app",course));

                //Toast.makeText(getApplicationContext(),subitem,Toast.LENGTH_SHORT).show();
                        //.putExtra("title",title).putExtra("folder",subitem));
            }
        });
    }




}
