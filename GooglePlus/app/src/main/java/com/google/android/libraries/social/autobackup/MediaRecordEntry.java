package com.google.android.libraries.social.autobackup;

import android.content.ContentValues;
import android.database.Cursor;
import ial;
import iam;
import ian;
import iao;

@ian(a="media_record")
public final class MediaRecordEntry
  extends ial
{
  public static final iao a = new iao(MediaRecordEntry.class);
  @iam(a="album_id")
  public String mAlbumId;
  @iam(a="allow_full_res", d=false, e="1")
  public boolean mAllowFullRes;
  @iam(a="bucket_id")
  private String mBucketId;
  @iam(a="bytes_total", d=false, e="-1")
  public long mBytesTotal;
  @iam(a="bytes_uploaded")
  public long mBytesUploaded;
  @iam(a="event_id")
  public String mEventId;
  @iam(a="fingerprint")
  public String mFingerprint;
  @iam(a="from_camera", d=false, e="0")
  private boolean mFromCamera;
  @iam(a="is_image", d=false, e="1")
  public boolean mIsImage;
  @iam(a="media_hash", d=false)
  private long mMediaHash;
  @iam(a="media_id", b=true, d=false)
  private long mMediaId;
  @iam(a="media_time", d=false)
  private long mMediaTime;
  @iam(a="media_url", d=false)
  public String mMediaUrl;
  @iam(a="mime_type")
  public String mMimeType;
  @iam(a="component_name")
  private String mRawComponentName;
  @iam(a="resume_token")
  public String mResumeToken;
  @iam(a="retry_end_time", d=false, e="0")
  public long mRetryEndTime;
  @iam(a="upload_account_id", d=false, e="-1")
  public int mUploadAccountId = -1;
  @iam(a="upload_error")
  private String mUploadError;
  @iam(a="upload_finish_time", d=false, e="0")
  public long mUploadFinishTime;
  @iam(a="upload_id")
  public long mUploadId;
  @iam(a="upload_reason", d=false, e="0")
  public int mUploadReason;
  @iam(a="upload_state", d=false, e="500")
  public int mUploadState;
  @iam(a="upload_status", d=false, e="0")
  public int mUploadStatus;
  @iam(a="upload_task_state")
  public int mUploadTaskState;
  @iam(a="upload_time")
  public long mUploadTime;
  @iam(a="upload_url")
  public String mUploadUrl;
  
  public static MediaRecordEntry a(ContentValues paramContentValues)
  {
    return (MediaRecordEntry)a.a(paramContentValues, new MediaRecordEntry());
  }
  
  public static MediaRecordEntry a(Cursor paramCursor)
  {
    return (MediaRecordEntry)a.a(paramCursor, new MediaRecordEntry());
  }
  
  public final boolean a()
  {
    return (this.mUploadTaskState == 1) || (this.mUploadTaskState == 3);
  }
  
  public final String b()
  {
    switch (this.mUploadReason)
    {
    default: 
      return "Unknown";
    case 30: 
      return "InstantUpload";
    case 20: 
      return "InstantShare";
    case 40: 
      return "UploadAll";
    }
    return "Manual";
  }
  
  public final String toString()
  {
    String str1 = String.valueOf(a.a(this, new String[] { "media_id", "album_id", "event_id", "upload_account_id", "upload_url", "bytes_total" }));
    String str2 = " {";
    if (this.mUploadReason != 0)
    {
      String str14 = String.valueOf(str2);
      String str15 = String.valueOf(b());
      str2 = 2 + String.valueOf(str14).length() + String.valueOf(str15).length() + str14 + str15 + ", ";
    }
    String str3 = String.valueOf(str2);
    String str4;
    String str6;
    label376:
    String str9;
    label448:
    String str12;
    label532:
    String str10;
    switch (this.mUploadState)
    {
    default: 
      str4 = "Unknown";
      String str5 = String.valueOf(str4);
      switch (this.mUploadStatus)
      {
      case 3: 
      case 4: 
      case 5: 
      case 6: 
      case 7: 
      case 8: 
      case 9: 
      case 17: 
      case 18: 
      case 19: 
      case 24: 
      case 25: 
      case 26: 
      case 27: 
      case 28: 
      case 29: 
      default: 
        str6 = "Unknown";
        String str7 = String.valueOf(str6);
        String str8 = String.valueOf(1 + String.valueOf(str5).length() + String.valueOf(str7).length() + str5 + "/" + str7);
        if (str8.length() != 0)
        {
          str9 = str3.concat(str8);
          String str11;
          if (this.mUploadTaskState != 0) {
            str11 = String.valueOf(str9);
          }
          switch (this.mUploadTaskState)
          {
          case 2: 
          default: 
            str12 = "Unknown";
            String str13 = String.valueOf(str12);
            str9 = 2 + String.valueOf(str11).length() + String.valueOf(str13).length() + str11 + ", " + str13;
            str10 = String.valueOf(String.valueOf(str9).concat("}"));
            if ((this.mBytesTotal != 0L) && (this.mBytesUploaded != 0L)) {}
            break;
          }
        }
        break;
      }
      break;
    }
    for (int i = 0;; i = Math.min((int)Math.round(100.0D * ((float)this.mBytesUploaded / (float)this.mBytesTotal)), 100))
    {
      return 15 + String.valueOf(str1).length() + String.valueOf(str10).length() + str1 + str10 + " [" + i + "%]";
      str4 = "queued";
      break;
      str4 = "pending";
      break;
      str4 = "failed";
      break;
      str4 = "done";
      break;
      str4 = "don't upload";
      break;
      str6 = "ok";
      break label376;
      str6 = "in progress";
      break label376;
      str6 = "stalled";
      break label376;
      str6 = "no wifi";
      break label376;
      str6 = "roaming";
      break label376;
      str6 = "no power";
      break label376;
      str6 = "upsync disabled";
      break label376;
      str6 = "downsync disabled";
      break label376;
      str6 = "background disabled";
      break label376;
      str6 = "yielded";
      break label376;
      str6 = "user auth";
      break label376;
      str6 = "no storage";
      break label376;
      str6 = "no network";
      break label376;
      str6 = "network exception";
      break label376;
      str6 = "FAIL quota";
      break label376;
      str6 = "FAIL user auth";
      break label376;
      str6 = "FAIL no storage";
      break label376;
      str6 = "FAIL invalid metadata";
      break label376;
      str6 = "FAIL duplicate";
      break label376;
      str6 = "FAIL no fingerprint";
      break label376;
      str6 = "FAIL disabled";
      break label376;
      str6 = "FAIL google exif";
      break label376;
      str6 = "FAIL skipped";
      break label376;
      str6 = "FAIL cancelled";
      break label376;
      str6 = "FAIL exceed retry time";
      break label376;
      str6 = "FAIL media gone";
      break label376;
      str9 = new String(str3);
      break label448;
      str12 = "uploading";
      break label532;
      str12 = "queued";
      break label532;
      str12 = "completed";
      break label532;
      str12 = "failed";
      break label532;
      str12 = "being stalled";
      break label532;
      str12 = "being cancelled";
      break label532;
      str12 = "cancelled";
      break label532;
      str12 = "unauthorized";
      break label532;
      str12 = "quota exceeded";
      break label532;
      str12 = "skipped";
      break label532;
      str12 = "duplicate";
      break label532;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.libraries.social.autobackup.MediaRecordEntry
 * JD-Core Version:    0.7.0.1
 */