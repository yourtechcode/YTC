package com.diegodobelo.expandinganimlib;

import android.app.Activity;

import android.content.Intent;

import android.os.Bundle;
import android.view.View;

import android.widget.TextView;


import com.diegodobelo.expandingview.ExpandingItem;
import com.diegodobelo.expandingview.ExpandingList;
import com.example.videoplayback.VideoStreamingActivity;


public class PhotoActivity extends Activity {
    private ExpandingList mExpandingList;
    interface OnItemCreated {
        void itemCreated(String title);
    }
    public String aamit;
    private ExpandingItem mExpandedItem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_photo);
        mExpandingList = (ExpandingList) findViewById(R.id.expanding_list_main);
        createItems();


    }

    private void createItems() {
        addItem("introduction",new String[]{"introduction.mp4","get-the-best-photoshop-version.mp4","activity-create-a-black-and-white-image.mp4","optional-speed-up-photoshop.mp4","photoshop-search.mp4"},R.color.green,R.drawable.ic_ghost);
        addItem("get-started",new String[]{"006-introduction.mp4","007-use-photoshops-interface-efficiently.mp4","008-customize-your-workspace.mp4","009-create-a-new-project.mp4","010-activity-crop-and-straighten-photos.mp4","011-open-images-in-6-ways.mp4","012-navigate-through-your-project.mp4","013-save-share-your-work-5-ways.mp4","014-activity-resize-an-image.mp4","015-review.mp4"},R.color.blue,R.drawable.ic_ghost);
        addItem("layers-101",new String[]{"016-introduction.mp4","017-optional-what-are-layers.mp4","018-start-using-layers.mp4","019-use-the-layers-panel.mp4","020-select-layers.mp4","021-move-layers.mp4","022-exercise-layer-dexterity.mp4","023-solution-layer-dexterity.mp4","024-arrange-images-quickly.mp4","025-layer-opacity-vs.-fill.mp4","026-exercise-fast-alignment.mp4","027-solution-fast-alignment.mp4","028-review.mp4"},R.color.yellow,R.drawable.ic_ghost);
        addItem("layers-102",new String[]{"029-introduction.mp4","030-layer-types-explained.mp4","031-customize-the-layers-panel.mp4","032-identify-layers.mp4","033-filter-layers.mp4","034-exercise-sort-layers.mp4","035-solution-sort-layers.mp4","036-manipulate-layers.mp4","037-use-blending-modes.mp4","038-lock-layers.mp4","039-optional-best-layer-hotkeys.mp4","040-review.mp4"},R.color.orange,R.drawable.ic_ghost);
        addItem("raster-layers",new String[]{"041-introduction.mp4","042-optional-photoshop-vs.-illustrator.mp4","043-use-the-brush-tool.mp4","044-activity-soften-skin-imperfections.mp4","045-use-the-eye-dropper-swatches.mp4","046-optional-fix-the-eye-dropper.mp4","047-resolution-vs.-image-size.mp4","048-optional-change-tshirt-color.mp4","049-optimize-project-size.mp4","050-nondestructive-editing.mp4","051-review.mp4"},R.color.pink,R.drawable.ic_ghost);
        addItem("selections-101",new String[]{"052-selections-explained.mp4","053-modify-selections.mp4","054-rectangular-marquee.mp4","055-elliptical-marquee.mp4","056-exercise-hands-on-marquees.mp4","057-solution-hands-on-marquees.mp4","058-hide-pixels-with-layer-masks.mp4","059-activity-combine-2-images-with-layer-masks.mp4","060-quick-selection-tool-and-magic-wand.mp4","061-activity-make-an-orange-purple.mp4","062-save-load-selections.mp4","063-activity-change-the-color-of-tshirt-v2.mp4","064-review.mp4"},R.color.purple,R.drawable.ic_ghost);
        addItem("selections-102",new String[]{"065-introduction.mp4","066-use-lasso-tools.mp4","067-pen-tool-overview.mp4","068-use-direct-path-selection-tools.mp4","069-activity-pen-tool-selections.mp4","070-quick-mask-mode.mp4","071-select-a-color-in-a-photo.mp4","072-activity-remove-background.mp4","073-select-and-mask-hair.mp4","074-channel-selections.mp4","075-review.mp4"},R.color.green,R.drawable.ic_ghost);
        addItem("shape-layers",new String[]{"076-introduction.mp4","077-create-shapes.mp4","078-modify-shapes.mp4","079-activity-design-web-buttons.mp4","080-use-custom-shapes.mp4","081-activity-design-shapes-with-the-pen-tool.mp4","082-generate-guides-from-shapes.mp4","083-place-images-in-shapes.mp4","084-activity-create-a-website-layout.mp4","085-activity-design-a-flat-illustration-part-1.mp4","086-activity-design-a-flat-illustration-part-2.mp4","087-activity-design-a-flat-illustration-part-3.mp4","088-review.mp4"},R.color.blue,R.drawable.ic_ghost);
        addItem("creative-layer-styles",new String[]{"089-introduction.mp4","090-layer-styles-crash-course.mp4","091-download-scale-layer-styles.mp4","092-create-gold-text-effect.mp4","093-embed-text-in-photos.mp4","094-use-global-light.mp4","095-create-shiny-3d-text.mp4","096-create-neon-effect.mp4","097-activity-design-an-emoji-part-1.mp4","098-activity-design-an-emoji-part-2.mp4","099-activity-animate-an-emoji-part-1.mp4","100-activity-animate-an-emoji-part-2.mp4","101-create-a-fire-text-effect.mp4","102-review.mp4"},R.color.yellow,R.drawable.ic_ghost);
        addItem("work-with-smart-objects",new String[]{"103-smart-objects-explained.mp4","104-activity-design-an-android-icon.mp4","105-create-your-own-app-icon.mp4","106-breaking-smart-objects.mp4","107-showcase-your-work-professionally.mp4","108-activity-create-a-realistic-mockup.mp4","109-linked-smart-objects.mp4","110-filters-with-smart-objects.mp4","111-activity-create-a-business-card-part-1.mp4","112-activity-create-a-business-card-part-2.mp4","113-activity-create-a-business-card-part-3.mp4","114-review.mp4"},R.color.orange,R.drawable.ic_ghost);
        addItem("create-a-cute-character",new String[]{"115-activity-create-the-shape.mp4","116-activity-add-layer-styles.mp4","117-activity-finishing-touches.mp4"},R.color.pink,R.drawable.ic_ghost);
        addItem("repair-your-photos",new String[]{"118-introduction.mp4","119-remove-skin-issues.mp4","120-remove-watch-necklace-from-photos.mp4","121-clean-up-face-imperfections.mp4","122-move-people-in-photos.mp4","123-enhance-faded-photos.mp4","124-dodge-burn-sponge-tools.mp4","125-remove-red-eyes-from-photos.mp4","126-create-an-action-in-photoshop.mp4","127-resize-lots-of-images-quickly.mp4","128-review.mp4"},R.color.purple,R.drawable.ic_ghost);
        addItem("text-layers",new String[]{"129-text-layers-explained.mp4","130-font-types.mp4","131-get-new-fonts.mp4","132-learn-typography-best-practices.mp4","133-combine-fonts.mp4","134-exercise-hands-on-text-layers.mp4","135-solution-hands-on-text-layers.mp4","136-identify-a-font.mp4","137-stay-consistent-in-your-projects.mp4","138-align-text-layers.mp4","139-glyphs-explained.mp4","140-review.mp4"},R.color.green,R.drawable.ic_ghost);
        addItem("improve-your-photos",new String[]{"141-introduction.mp4","142-make-your-teeth-white.mp4","143-reshape-your-face.mp4","144-create-a-lens-flare.mp4","145-tilt-shift-miniaturize-objects.mp4","146-add-glowing-lines-to-photos.mp4","147-add-light-to-an-area.mp4","148-reshape-your-body.mp4","149-review.mp4"},R.color.blue,R.drawable.ic_ghost);
        addItem("course-conclusions-whats-next",new String[]{"150-final-words.mp4"},R.color.yellow,R.drawable.ic_ghost);


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
                String course = "photoshop";
                String finaltital = text.replaceAll(" ","%20");
                String finalsubitem = subTitle.toString().replaceAll(" ","%20");
                String subitem = subTitle.toString();

                startActivity(new Intent(PhotoActivity.this , VideoStreamingActivity.class).putExtra("real",subitem).putExtra("amit",finaltital).putExtra("bera",finalsubitem).putExtra("app",course));

                //Toast.makeText(getApplicationContext(),subitem,Toast.LENGTH_SHORT).show();
                //.putExtra("title",title).putExtra("folder",subitem));
            }
        });
    }




}
