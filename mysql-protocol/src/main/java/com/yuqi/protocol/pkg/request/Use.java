package com.yuqi.protocol.pkg.request;

import com.yuqi.protocol.pkg.AbstractReaderAndWriter;
import com.yuqi.protocol.utils.IOUtils;
import io.netty.buffer.ByteBuf;

/**
 * @author yuqi
 * @mail yuqi5@xiaomi.com
 * @description your description
 * @time 26/7/20 17:15
 **/
public class Use extends AbstractReaderAndWriter {
    private String db;

    public String getDb() {
        return db;
    }

    @Override
    public void read(ByteBuf byteBuf) {
        this.db = IOUtils.readString(byteBuf);
    }
}