package org.chromium.net;

import java.security.cert.CertificateEncodingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.chromium.base.annotations.CalledByNative;
import org.chromium.base.annotations.JNINamespace;

@JNINamespace
public class AndroidCertVerifyResult
{
  private final int a;
  private final boolean b;
  private final List<X509Certificate> c;
  
  public AndroidCertVerifyResult(int paramInt)
  {
    this.a = paramInt;
    this.b = false;
    this.c = Collections.emptyList();
  }
  
  public AndroidCertVerifyResult(int paramInt, boolean paramBoolean, List<X509Certificate> paramList)
  {
    this.a = 0;
    this.b = paramBoolean;
    this.c = new ArrayList(paramList);
  }
  
  @CalledByNative
  public byte[][] getCertificateChainEncoded()
  {
    arrayOfByte = new byte[this.c.size()][];
    int i = 0;
    try
    {
      while (i < this.c.size())
      {
        arrayOfByte[i] = ((X509Certificate)this.c.get(i)).getEncoded();
        i++;
      }
      return arrayOfByte;
    }
    catch (CertificateEncodingException localCertificateEncodingException)
    {
      return new byte[0][];
    }
  }
  
  @CalledByNative
  public int getStatus()
  {
    return this.a;
  }
  
  @CalledByNative
  public boolean isIssuedByKnownRoot()
  {
    return this.b;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     org.chromium.net.AndroidCertVerifyResult
 * JD-Core Version:    0.7.0.1
 */