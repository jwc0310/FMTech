package com.google.android.libraries.social.gallery3d.common;

import ial;
import iam;
import ian;
import iao;

@ian(a="files")
public final class FileCache$FileEntry
  extends ial
{
  public static final iao a = new iao(FileEntry.class);
  @iam(a="content_url")
  public String contentUrl;
  @iam(a="filename")
  public String filename;
  @iam(a="hash_code", b=true)
  public long hashCode;
  @iam(a="last_access", b=true)
  public long lastAccess;
  @iam(a="size")
  public long size;
  
  public final String toString()
  {
    long l1 = this.hashCode;
    String str1 = this.contentUrl;
    long l2 = this.lastAccess;
    String str2 = this.filename;
    return 87 + String.valueOf(str1).length() + String.valueOf(str2).length() + "hash_code: " + l1 + ", content_url" + str1 + ", last_access" + l2 + ", filename" + str2;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.libraries.social.gallery3d.common.FileCache.FileEntry
 * JD-Core Version:    0.7.0.1
 */