package com.diegodobelo.expandinganimlib;

import android.app.Activity;

import android.content.Intent;

import android.os.Bundle;
import android.view.View;

import android.widget.TextView;


import com.diegodobelo.expandingview.ExpandingItem;
import com.diegodobelo.expandingview.ExpandingList;
import com.example.videoplayback.VideoStreamingActivity;


public class UnityActivity extends Activity {
    private ExpandingList mExpandingList;
    interface OnItemCreated {
        void itemCreated(String title);
    }
    public String aamit;
    private ExpandingItem mExpandedItem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_unity);
        mExpandingList = (ExpandingList) findViewById(R.id.expanding_list_main);
        createItems();


    }

    private void createItems() {
        addItem("Intro to Unity course",new String[]{"Unity 3D Course overview.mp4","Where to get free live help  other cool stuff.mp4","Downloading  installing Unity 3D macOS.mp4","Downloading  installing Unity 3D Windows.mp4","Zombie Roller Your First Unity 3D Game.mp4","Unity 3D pricing plans.mp4"},R.color.pink,R.drawable.ic_ghost);
        addItem("Learn to code in C in Unity 3D",new String[]{"C variables in Unity 3D.mp4","C numbers in Unity 3D.mp4","C conditionals in Unity 3D.mp4","C arrays  loops in Unity 3D.mp4","C functions  methods in Unity 3D.mp4","Object oriented programming  inheritance in C for Unity.mp4"},R.color.purple,R.drawable.ic_ghost);
        addItem("Haunted Zombie Rush - Unity 3D game",new String[]{"Intro\\ to\\ Haunted\\ Zombie\\ Rush\\ in\\ Unity.mp4","3D\\ Game\\ Assets\\ for\\ your\\ games\\ in\\ Unity.mp4","Unity\\ 3D\\ interface\\ overview.mp4","Project\\ creation\\ \\ importing\\ assets\\ into\\ Unity\\ 3D.mp4","Working\\ with\\ lighting\\ \\ materials\\ in\\ Unity\\ 3D.mp4","Altering\\ shaders\\ in\\ Unity\\ 3D.mp4","Switching\\ build\\ platforms\\ in\\ Unity\\ 3D.mp4","Moving\\ objects\\ in\\ Unity\\ 3D.mp4","Coroutines\\ \\ wait\\ times\\ in\\ Unity\\ 3D.mp4","Inheritance\\ \\ reusability\\ in\\ Unity\\ 3D.mp4","Importing\\ \\ animating\\ a\\ character\\ model\\ in\\ Unity\\ 3D.mp4","Unity\\ 3D\\ rigidbody\\ \\ adding\\ force\\ with\\ physics.mp4","Working\\ with\\ audio\\ in\\ Unity\\ 3D.mp4","Detection\\ collisions\\ \\ using\\ assertions\\ in\\ Unity\\ 3D.mp4","Game\\ state\\ \\ singletons\\ in\\ Unity\\ 3D.mp4","Creating\\ a\\ 2nd\\ camera\\ \\ how\\ to\\ make\\ UI\\ in\\ Unity\\ 3D.mp4","Exercise\\ -\\ Extending\\ your\\ Unity\\ 3D\\ Game.mp4","Switching\\ to\\ a\\ better\\ code\\ editor\\ VS\\ Code.mp4"},R.color.green,R.drawable.ic_ghost);
        addItem("Devslopes Defender 2D Game in Unity 3D",new String[]{"Intro\\ to\\ Devslopes\\ Defender\\ Unity\\ 3D\\ game.mp4","The\\ 2D\\ Game\\ Assets\\ for\\ your\\ games\\ in\\ Unity.mp4","Importing\\ sprites\\ \\ grid\\ snapping\\ in\\ Unity\\ 3D\\ Part\\ 1.mp4","Importing\\ sprites\\ \\ grid\\ snapping\\ in\\ Unity\\ 3D\\ Part\\ 2.mp4","Animations\\ \\ 2D\\ colliders\\ in\\ Unity\\ 3D.mp4","Game\\ manager\\ singleton\\ \\ spawning\\ in\\ Unity\\ 3D.mp4","Enemy\\ pathfinding\\ in\\ Unity\\ 3D.mp4","Generics\\ \\ singletons\\ in\\ Unity\\ 3D.mp4","Data\\ encapsulation\\ spritesheets\\ \\ buttons\\ in\\ Unity\\ 3D.mp4","2D\\ Raycasts\\ tags\\ and\\ placing\\ towers\\ in\\ Unity\\ 3D.mp4","Projectiles\\ colliders\\ and\\ more\\ tower\\ placement\\ in\\ Unity\\ 3D.mp4","Registering\\ enemies\\ \\ distance-based\\ attacks\\ in\\ Unity\\ 3D.mp4","Shooting\\ projectiles\\ at\\ enemies\\ in\\ Unity\\ 3D.mp4","Killing\\ enemies\\ \\ other\\ animations\\ in\\ Unity\\ 3D.mp4","More\\ UI\\ \\ finishing\\ touches\\ in\\ Unity\\ 3D.mp4","UI\\ Labels\\ \\ buttons\\ for\\ GUI\\ in\\ Unity\\ 3D.mp4","Building\\ your\\ Unity\\ 3D\\ game\\ logic\\ part\\ 1.mp4","Building\\ your\\ Unity\\ 3D\\ game\\ logic\\ part\\ 2.mp4","Adding\\ sound\\ FX\\ to\\ your\\ Unity\\ 3D\\ game.mp4","Spawning\\ random\\ enemies\\ in\\ your\\ Unity\\ 3D\\ game.mp4","Exporting\\ your\\ game\\ as\\ a\\ standalone\\ platform\\ in\\ Unity\\ 3D.mp4"},R.color.blue,R.drawable.ic_ghost);
        addItem("Legend of Devslopes Fantasy Game in Unity 3D",new String[]{"Intro\\ to\\ Legend\\ of\\ Devslopes\\ in\\ Unity.mp4","Prepping\\ the\\ Unity\\ project\\ \\ building\\ the\\ level.mp4","Importing\\ character\\ assets\\ into\\ Unity.mp4","Creating\\ the\\ character\\ animation\\ controller\\ in\\ Unity.mp4","Animating\\ the\\ player\\ in\\ Unity.mp4","Enemy\\ pathfinding\\ \\ navigation\\ in\\ Unity.mp4","Rigidbody\\ and\\ weapons\\ in\\ Unity.mp4","Implementing\\ enemy\\ attack\\ systems\\ in\\ Unity.mp4","Implementing\\ player\\ health\\ in\\ Unity.mp4","Enemy\\ health\\ \\ player\\ attack\\ in\\ Unity.mp4","Heads\\ up\\ display\\ \\ UI\\ in\\ Unity.mp4","Particle\\ systems\\ in\\ Unity.mp4","How\\ to\\ create\\ spawn\\ points\\ in\\ Unity.mp4","Game\\ manager\\ singleton\\ in\\ Unity.mp4","Adjusting\\ animations\\ in\\ Unity.mp4","Creating\\ ranged\\ arrow\\ attacks\\ in\\ Unity.mp4","Health\\ powerup\\ feature\\ and\\ logic\\ in\\ Unity.mp4","Speed\\ powerup\\ feature\\ and\\ logic\\ in\\ Unity.mp4","Creating\\ a\\ game\\ menu\\ in\\ Unity.mp4","Legend\\ of\\ Devslopes\\ finishing\\ touches\\ in\\ Unity.mp4"},R.color.orange,R.drawable.ic_ghost);
        addItem("Devslopes Devcraft Game MineCraft Clone",new String[]{"Intro\\ to\\ Devcraft\\ game.mp4","Creating\\ your\\ first\\ plane\\ of\\ cubes.mp4","Create\\ Multiple\\ Voxels.mp4","Creating\\ multiple\\ chunks\\ of\\ Voxels.mp4","Adding\\ Dimensions.mp4","Setting\\ up\\ textures\\ for\\ mobile.mp4","Camera\\ setup\\ for\\ our\\ character.mp4","Adding\\ movement\\ to\\ your\\ character.mp4","Building\\ and\\ destroying\\ blocks.mp4","Character\\ Spawning.mp4","Rotating\\ your\\ character.mp4","Fixing\\ a\\ few\\ bugs.mp4","Adding\\ Audio.mp4","Building\\ your\\ game\\ to\\ Android.mp4","Building\\ your\\ game\\ to\\ iOS.mp4"},R.color.yellow,R.drawable.ic_ghost);
        addItem("Beginner  Advanced Lighting in Unity",new String[]{"Intro to lightning.mp4","Creating particle effects in Unity.mp4","Working with skyboxes  directional lights in Unity.mp4","Using point lights to create mood in Unity 3D.mp4","Working with spot lights  subtle light changes.mp4","How to use cookies in lighting in Unity.mp4","How to bake lighting  support mobile games in Unity.mp4"},R.color.pink,R.drawable.ic_ghost);
        addItem("Cinematics  Animations in Unity",new String[]{"Intro to Animation  Cinematics in Unity 3D.mp4","Unity 3D animation editor.mp4","Unity cutscenes cameras  animation events.mp4","Animation curves camera management  character cinematics in Unity.mp4"},R.color.blue,R.drawable.ic_ghost);
        addItem("Skeletons VS Zombies MOBA in Unity",new String[]{"Intro\\ to\\ Skeletons\\ VS\\ Zombies.mp4","Pathfinding\\ with\\ Navigation\\ Mesh\\ in\\ Unity\\ 3D.mp4","Camera\\ controls\\ for\\ MOBA\\ in\\ Unity.mp4","Point\\ \\ click\\ movement\\ with\\ pathfinding\\ in\\ Unity.mp4","Animations\\ \\ fireball\\ particle\\ effect\\ in\\ Unity.mp4","Shooting\\ fireballsbullets\\ in\\ Unity.mp4","Intro\\ to\\ Unity\\ 3D\\ multiplayer.mp4","Network\\ Manager\\ \\ spawn\\ points.mp4","Networking\\ \\ player\\ movement\\ in\\ Unity.mp4","Networking\\ projectiles\\ in\\ Unity.mp4","SyncVars\\ \\ keeping\\ game\\ data\\ synchronized\\ across\\ the\\ network\\ in\\ Unity.mp4","Rpc\\ \\ calling\\ client\\ functions\\ from\\ the\\ server\\ in\\ Unity.mp4","Unity\\ Multiplayer\\ Service\\ \\ online\\ matchmaking\\ in\\ Unity.mp4"},R.color.purple,R.drawable.ic_ghost);




    }


    public void addItem(String title, String[] subItems, int colorRes, int iconRes ) {
        for (int index =0; index < subItems.length; index++){
            subItems[index] = subItems[index].replace("\\","");
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
                String course = "devslopes-unity3d";
                String finaltital = text.replaceAll(" ","%20");
                String finalsubitem = subTitle.toString().replaceAll(" ","%20");
                String subitem = subTitle.toString();

                startActivity(new Intent(UnityActivity.this , VideoStreamingActivity.class).putExtra("real",subitem).putExtra("amit",finaltital).putExtra("bera",finalsubitem).putExtra("app",course));

                //Toast.makeText(getApplicationContext(),subitem,Toast.LENGTH_SHORT).show();
                //.putExtra("title",title).putExtra("folder",subitem));
            }
        });
    }




}
