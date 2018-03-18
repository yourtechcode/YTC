package com.diegodobelo.expandinganimlib;

import android.app.Activity;

import android.content.Intent;

import android.os.Bundle;
import android.view.View;

import android.widget.TextView;


import com.diegodobelo.expandingview.ExpandingItem;
import com.diegodobelo.expandingview.ExpandingList;
import com.example.videoplayback.VideoStreamingActivity;


public class HackingActivity extends Activity {
    private ExpandingList mExpandingList;
    interface OnItemCreated {
        void itemCreated(String title);
    }
    public String aamit;
    private ExpandingItem mExpandedItem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hacking);
        mExpandingList = (ExpandingList) findViewById(R.id.expanding_list_main);
        createItems();


    }

    private void createItems() {
        addItem("introduction-to-ethical-hacking",new String[]{"001-course-intro.mp4","002-osi-model-and-cia.mp4","003-spoofing-and-hijacking.mp4","004-cross-site-scripting-cross-site-request-forgery.mp4","005-sql-injection.mp4","006-wireless-network-security.mp4","007-common-malware.mp4"},R.color.pink,R.drawable.ic_ghost);
        addItem("kali-101",new String[]{"008-about-kali-and-use-cases.mp4","009-installing-and-configuring-kali-on-a-vmware-virtual-machine.mp4","010-configuring-the-network-adapter.mp4","011-booting-kali-for-the-first-time.mp4","012-basic-commands-with-kali-and-vmware.mp4","013-basic-kali-configuration.mp4","014-configuring-your-network.mp4","015-requesting-and-configuring-ip-addresses.mp4","016-managing-services-in-kali.mp4","017-managing-apache-in-kali.mp4","018-managing-ssh-in-kali.mp4","019-managing-mysql-in-kali.mp4","020-vulnerability-analysis-tools-overview.mp4","021-tools-overview.mp4","022-information-gathering-tools-overview.mp4","023-maltego.mp4","024-web-applications-tools-overview.mp4","025-burp-suite.mp4","026-password-attacks-tools-overview.mp4","027-ophcrack.mp4","028-armitage.mp4","029-cracking-wifi-passwords-on-a-wep-network.mp4","030-top-10-security-tools-overview.mp4"},R.color.yellow,R.drawable.ic_ghost);
        addItem("penetration-testing-methodologies",new String[]{"031-penetration-testing.mp4","032-pentesting-techniques.mp4","033-scope-of-pentesting.mp4","034-types-of-pentesting-and-its-strategies-part-1.mp4","035-types-of-pentesting-and-its-strategies-part-2.mp4","036-types-of-pentesting-and-its-strategies-part-3.mp4","037-types-of-pentesting-and-its-strategies-part-4.mp4"},R.color.orange,R.drawable.ic_ghost);
        addItem("bonus-labs",new String[]{"038-injecting-mysql-logs.mp4","039-threat-actor-attribution.mp4","040-understanding-heap-overflow-protection.mp4","041-source-code-fuzzing-lab-crash-analysis-using-american-fuzzy-lop.mp4","042-intercepting-process-injection-on-suspended-threads.mp4"},R.color.purple,R.drawable.ic_ghost);


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
                String course = "ethicalhacking";
                String finaltital = text.replaceAll(" ","%20");
                String finalsubitem = subTitle.toString().replaceAll(" ","%20");
                String subitem = subTitle.toString();

                startActivity(new Intent(HackingActivity.this , VideoStreamingActivity.class).putExtra("real",subitem).putExtra("amit",finaltital).putExtra("bera",finalsubitem).putExtra("app",course));

                //Toast.makeText(getApplicationContext(),subitem,Toast.LENGTH_SHORT).show();
                //.putExtra("title",title).putExtra("folder",subitem));
            }
        });
    }




}
