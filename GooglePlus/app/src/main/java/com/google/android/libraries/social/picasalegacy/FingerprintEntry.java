package com.google.android.libraries.social.picasalegacy;

import ial;
import iam;
import ian;
import iao;
import ias;

@ian(a="fingerprints")
public final class FingerprintEntry
  extends ial
{
  public static final iao a = new iao(FingerprintEntry.class);
  @iam(a="content_uri", b=true)
  public final String contentUri;
  @iam(a="image_url")
  public final String imageUrl;
  @iam(a="fingerprint")
  public final byte[] rawFingerprint;
  
  public FingerprintEntry(String paramString1, String paramString2, ias paramias)
  {
    this.contentUri = paramString1;
    this.imageUrl = paramString2;
    this.rawFingerprint = paramias.a;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.libraries.social.picasalegacy.FingerprintEntry
 * JD-Core Version:    0.7.0.1
 */