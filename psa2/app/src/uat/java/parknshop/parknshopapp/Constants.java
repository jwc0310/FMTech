package parknshop.parknshopapp;

/**
 * Created by kwongyuenpan on 29/12/15.
 */
public class Constants {
    public static final boolean TEST_MODE = true;
    public static final boolean ENABLE_CERTIFICATE_PINNING = false;

    public static final String cert1 = // "-----BEGIN CERTIFICATE-----\n"
            "MIIFajCCBFKgAwIBAgISESElMJB1Zf6KqXmQOdXi6j8LMA0GCSqGSIb3DQEBCwUA\n"
                    + "MGYxCzAJBgNVBAYTAkJFMRkwFwYDVQQKExBHbG9iYWxTaWduIG52LXNhMTwwOgYD\n"
                    + "VQQDEzNHbG9iYWxTaWduIE9yZ2FuaXphdGlvbiBWYWxpZGF0aW9uIENBIC0gU0hB\n"
                    + "MjU2IC0gRzIwHhcNMTQxMDA5MDgxMjA5WhcNMTYwOTExMjM1OTU5WjCBlzELMAkG\n"
                    + "A1UEBhMCVFcxDzANBgNVBAgTBlRhaXdhbjEPMA0GA1UEBxMGVGFpcGVpMRAwDgYD\n"
                    + "VQQLEwdJVCBERVBUMS8wLQYDVQQKEyZQUkVTSURFTlQgU1RBUkJVQ0tTIENPRkZF\n"
                    + "RSBDT1JQT1JBVElPTjEjMCEGA1UEAxMabXlvdGdjYXJkLnN0YXJidWNrcy5jb20u\n"
                    + "dHcwggEiMA0GCSqGSIb3DQEBAQUAA4IBDwAwggEKAoIBAQDJ7WNi7bGSWcxNI2oW\n"
                    + "zdRP9P1pTYHxbWJYAO8kcmzClRm+29+ZGnv626/XPhcBQ9pbT/L5k1Ni7hHnKbG4\n"
                    + "MyQv/XKJlKIgErGtNnY/3db98QjasM6Kk5Usm7nWjgv6jpXLODJzBz4WE1umGF8S\n"
                    + "/hoVqb6Qy2opUpcOexc/wSKmgStMDKYJe6nai06jwis/D30nlPwVy0mvzij2oE4H\n"
                    + "a/OU1R0V3fB3KibYPgZ67JFB9Ubbe2jgUT90IrcrPWbf62xAkmumKsHsrdyPcK4n\n"
                    + "vNAXN5oSLbbG1Z5JeEzF+gdk7v8VY+I+My4q8CdZ037250hU0q1wncN7Od2jeEZE\n"
                    + "fQTlAgMBAAGjggHeMIIB2jAOBgNVHQ8BAf8EBAMCBaAwSQYDVR0gBEIwQDA+BgZn\n"
                    + "gQwBAgIwNDAyBggrBgEFBQcCARYmaHR0cHM6Ly93d3cuZ2xvYmFsc2lnbi5jb20v\n"
                    + "cmVwb3NpdG9yeS8wJQYDVR0RBB4wHIIabXlvdGdjYXJkLnN0YXJidWNrcy5jb20u\n"
                    + "dHcwCQYDVR0TBAIwADAdBgNVHSUEFjAUBggrBgEFBQcDAQYIKwYBBQUHAwIwSQYD\n"
                    + "VR0fBEIwQDA+oDygOoY4aHR0cDovL2NybC5nbG9iYWxzaWduLmNvbS9ncy9nc29y\n"
                    + "Z2FuaXphdGlvbnZhbHNoYTJnMi5jcmwwgaAGCCsGAQUFBwEBBIGTMIGQME0GCCsG\n"
                    + "AQUFBzAChkFodHRwOi8vc2VjdXJlLmdsb2JhbHNpZ24uY29tL2NhY2VydC9nc29y\n"
                    + "Z2FuaXphdGlvbnZhbHNoYTJnMnIxLmNydDA/BggrBgEFBQcwAYYzaHR0cDovL29j\n"
                    + "c3AyLmdsb2JhbHNpZ24uY29tL2dzb3JnYW5pemF0aW9udmFsc2hhMmcyMB0GA1Ud\n"
                    + "DgQWBBQwsKI/V+0QqeThGKh5wlthjBcakzAfBgNVHSMEGDAWgBSW3mHxvRwWKVMc\n"
                    + "wMx9O4MAQOYafDANBgkqhkiG9w0BAQsFAAOCAQEAPYOXc45LoONKNHtba1BF+HlZ\n"
                    + "zyZ0sy1yYjof76523dd1SV/xyDVvwQmNWp9xXMdMuhuNpeBOjOjD8lO/FY16O9wX\n"
                    + "oyh2n+1j0oodV1DueveJ2/11zWoqXRoRm7IQI139O6SjHNexl0I3WhLxg3uzSwBx\n"
                    + "fCW5Om40UWbZryx7/CQqa/L7PlmwjoJ0bDHdrXmAywRUHTG33dPkortveMBQ1r3U\n"
                    + "knmbXkPmA6zcDuzmlCJGdPR5zlTkBDzBOjNINIqvqlFsgU4mkQg3ic45uG60YxeZ\n"
                    + "RYpgbNdfNI8xdHdVVryiQ/Z0V4DtZg4L0Q2TLUkdEuPUQqYLwYsT+6Bn65otsg==\n";
    // + "-----END CERTIFICATE-----";

    public static final String cert2 = "MIIFXjCCBEagAwIBAgISESGgx8u/87EMnEMlUnkr93E+MA0GCSqGSIb3DQEBCwUA \n" +
            "MGYxCzAJBgNVBAYTAkJFMRkwFwYDVQQKExBHbG9iYWxTaWduIG52LXNhMTwwOgYD \n" +
            "VQQDEzNHbG9iYWxTaWduIE9yZ2FuaXphdGlvbiBWYWxpZGF0aW9uIENBIC0gU0hB \n" +
            "MjU2IC0gRzIwHhcNMTUxMTA1MDEwNTUwWhcNMTgxMTA1MDEwNTUwWjCBkTELMAkG \n" +
            "A1UEBhMCVFcxDzANBgNVBAgTBlRhaXdhbjEPMA0GA1UEBxMGVGFpcGVpMRAwDgYD \n" +
            "VQQLEwdJVCBERVBUMS8wLQYDVQQKEyZQUkVTSURFTlQgU1RBUkJVQ0tTIENPRkZF \n" +
            "RSBDT1JQT1JBVElPTjEdMBsGA1UEAxMUbXNyLnN0YXJidWNrcy5jb20udHcwggEi \n" +
            "MA0GCSqGSIb3DQEBAQUAA4IBDwAwggEKAoIBAQDF4xUYoNsYWQSKy67dapFRSJ4Q \n" +
            "oV1JRVpB6iMtZ4YLFnpkTmL/Me0t4lsyTLMye1W6DK9ZaRvTxkkGtLaC3xxViQ8/ \n" +
            "XxKzsgrzYVLzzV2p2x3UDI7Ok8VXr95g3hxLYCIMt6VyIF4tXIQmvU2wCTr+5avb \n" +
            "xLnb9FfwTSRCWVzvaHajEN4RUfXt6zfCAXKeBe2iukzbyWe4paTwQ1ALvP0ofU2d \n" +
            "GQ8jPjwRh33a1MHegSqe8oAh7UIJQEgw5WuSVw1uyrrj2zQZxz7slXqlFmGStOKP \n" +
            "x/60FjasNkkw0tnd21aAPeWgfwmjuZz6aolmL1cK5cY3cDZlDgn3nrIWCIWLAgMB \n" +
            "AAGjggHYMIIB1DAOBgNVHQ8BAf8EBAMCBaAwSQYDVR0gBEIwQDA+BgZngQwBAgIw \n" +
            "NDAyBggrBgEFBQcCARYmaHR0cHM6Ly93d3cuZ2xvYmFsc2lnbi5jb20vcmVwb3Np \n" +
            "dG9yeS8wHwYDVR0RBBgwFoIUbXNyLnN0YXJidWNrcy5jb20udHcwCQYDVR0TBAIw \n" +
            "ADAdBgNVHSUEFjAUBggrBgEFBQcDAQYIKwYBBQUHAwIwSQYDVR0fBEIwQDA+oDyg \n" +
            "OoY4aHR0cDovL2NybC5nbG9iYWxzaWduLmNvbS9ncy9nc29yZ2FuaXphdGlvbnZh \n" +
            "bHNoYTJnMi5jcmwwgaAGCCsGAQUFBwEBBIGTMIGQME0GCCsGAQUFBzAChkFodHRw \n" +
            "Oi8vc2VjdXJlLmdsb2JhbHNpZ24uY29tL2NhY2VydC9nc29yZ2FuaXphdGlvbnZh \n" +
            "bHNoYTJnMnIxLmNydDA/BggrBgEFBQcwAYYzaHR0cDovL29jc3AyLmdsb2JhbHNp \n" +
            "Z24uY29tL2dzb3JnYW5pemF0aW9udmFsc2hhMmcyMB0GA1UdDgQWBBQzLjyJI2Vs \n" +
            "F8S9IXOXzPUr8k6nKzAfBgNVHSMEGDAWgBSW3mHxvRwWKVMcwMx9O4MAQOYafDAN \n" +
            "BgkqhkiG9w0BAQsFAAOCAQEAUA97biCqLyaVWQ5fNSm0Xt2Ge1Y6KHCSy/sbJ/rN \n" +
            "1LrPWhYCrXsYoh37K5i+sktaoCI2k+7RYM+3BMhJy5IdPV6Vv6hJHaRamnMHZb8J \n" +
            "DSY3I9mwx8c/8cTT2r0y/T0qv8fTnbOAAaYZXXcDm2t7rz2FLTlBL78NePucBs5Y \n" +
            "v385aL1VbXpfmnqnL+L0F4bH5IdD8Cl2PmmgUpppIQpCUUZR2jkaCoXZCPTpKJaC \n" +
            "hXUWGcZANEbjeDhHH77YVbDYnd34vKM0GFw6YNNEDlyw4sKkvCj9axVdh/V5gsJy \n" +
            "kj9a0oFeMbyWlhJJ2Z2OvoSffe4fECNBSnVlwmsSbv/Inw== ";

}
