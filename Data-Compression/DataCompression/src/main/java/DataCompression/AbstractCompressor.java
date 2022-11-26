package DataCompression;

package org.crosswire.common.compress;

import java.io.InputStream;


public abstract class AbstractCompressor implements Compressor {
    public AbstractCompressor(InputStream input) {
        this.input = input;
    }

    protected InputStream input;
}
Footer
© 2022 GitHub, Inc.
Footer navigation
Terms
Privacy
Security
Status
Docs
Contact GitHub
Pricing
API
Training
Blog
About
