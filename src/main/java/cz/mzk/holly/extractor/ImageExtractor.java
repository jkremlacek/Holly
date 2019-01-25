package cz.mzk.holly.extractor;

import cz.mzk.holly.fedora.FedoraRESTConnector;

import java.io.IOException;

public class ImageExtractor {
    // ToDo: Solve boilerplate code.
    public ImageExtractor(String uuid) {

        if (System.getenv("MZK_BASE").isEmpty()) {
            final String mzkBase = "/mzk";
        } else {
            final String mzkBase = System.getenv("MZK_BASE");
        }
        if (System.getenv("NDK_BASE").isEmpty()) {
            final String ndkBase = "/ndk";
        } else {
            final String ndkBase = System.getenv("NDK_BASE");
        }
        // ToDo: validate uuid
        // ToDo: mark as valid if valid
    }

    public ImageExtractor(String[] uuid) {

        if (System.getenv("MZK_BASE").isEmpty()) {
            final String mzkBase = "/mzk";
        } else {
            final String mzkBase = System.getenv("MZK_BASE");
        }
        if (System.getenv("NDK_BASE").isEmpty()) {
            final String ndkBase = "/ndk";
        } else {
            final String ndkBase = System.getenv("NDK_BASE");
        }
        // ToDo: validate uuids
        // ToDo: mark as valid if valid
    }

    public String getImagePath(String uuid) {
        FedoraRESTConnector fedora = new FedoraRESTConnector();
        String imageUrl;
        try {
            imageUrl = fedora.getImgAddressFromRels(uuid);

        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }

        return getPhysicalPath(imageUrl);
    }

    private String getPhysicalPath(String imgUrl) {
        // ToDo: Parsing a translating path
        return "";
    }

    private boolean isUuid(String uuid) {
        if (uuid == null)
            return false;

        return uuid.startsWith("uuid:");
    }
}
