package io.github.pleuvoir.netty.handler.out;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelOutboundHandlerAdapter;
import io.netty.channel.ChannelPromise;

/**
 * @author
 */
public class OutBoundHandlerD extends ChannelOutboundHandlerAdapter {
    public void write(ChannelHandlerContext ctx, Object msg, ChannelPromise promise) throws Exception {
        System.out.println("OutBoundHandlerD: " + msg);
        super.write(ctx, msg, promise);  //传递给下一个
    }
}
