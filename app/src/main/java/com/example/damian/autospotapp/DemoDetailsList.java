package com.example.damian.autospotapp;

/**
 * A list of all the demos we have available.
 */
public final class DemoDetailsList {

    /** This class should not be instantiated. */
    private DemoDetailsList() {
    }

    public static final DemoDetails[] DEMOS = {

            new DemoDetails(R.string.layers_demo_label,
                    R.string.layers_demo_description,
                    LayersDemoActivity.class),
            new DemoDetails(R.string.snapshot_demo_label,
                    R.string.snapshot_demo_description,
                    SnapshotDemoActivity.class),
            new DemoDetails(R.string.split_street_view_panorama_and_map_demo_label,
                    R.string.split_street_view_panorama_and_map_demo_description,
                    SplitStreetViewPanoramaAndMapDemoActivity.class),

    };
}
