package parknshop.parknshopapp.Model;

import java.util.ArrayList;

/**
 * Created by kwongyuenpan on 15/4/16.
 */
public class UploadImageResponse extends BaseStatus {

    public ArrayList<Data> data;

    public ArrayList<Data> getData() {
        return data;
    }

    public class Data {
        public String id;
        public String oldName;
        public String contentType;
        public String imageNewName;
        public long size;
        public String thumbnail;
        public long thumbnailSize;
        public String appId;
        public String section;

        public String getId() {
            return id;
        }

        public String getOldName() {
            return oldName;
        }

        public String getNewName() {
            return imageNewName;
        }

        public String getContentType() {
            return contentType;
        }

        public String getThumbnail() {
            return thumbnail;
        }

        public long getThumbnailSize() {
            return thumbnailSize;
        }

        public String getAppId() {
            return appId;
        }

        public String getSection() {
            return section;
        }

        public long getSize() {
            return size;
        }
    }
}
