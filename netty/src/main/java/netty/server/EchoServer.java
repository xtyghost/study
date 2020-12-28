package netty.server;

import java.net.InetSocketAddress;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.Channel;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import netty.handler.EchoServerHandler;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author xutong
 * @since 1.0.0
 */
public class EchoServer {
  private final int port;

  public EchoServer(int port) {
    this.port = port;
  }

  public static void main(String[] args) throws InterruptedException {
    if (args.length != 1) {
      System.err.println("Usage: " + EchoServer.class.getSimpleName() + "");
    }
    int port = Integer.parseInt(args[0]);
    new EchoServer(port).start();
  }

  private void start() throws InterruptedException {
    EchoServerHandler echoServerHandler = new EchoServerHandler();
    NioEventLoopGroup group = new NioEventLoopGroup();
    try {
      ServerBootstrap b = new ServerBootstrap();
      b.group(group)
          .channel(NioServerSocketChannel.class)
          .localAddress(new InetSocketAddress(port))
          .childHandler(
              new ChannelInitializer() {
                @Override
                protected void initChannel(Channel channel) throws Exception {
                  channel.pipeline().addLast(echoServerHandler);
                }
              });
      ChannelFuture f = b.bind().sync();
      f.channel().closeFuture().sync();

    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      group.shutdownGracefully().sync();
    }
  }
}
