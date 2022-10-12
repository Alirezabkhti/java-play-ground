package com.playground.main.learning.designpatterns.behavioral.iterator.channel;

import java.util.ArrayList;
import java.util.List;

public class ChannelDefaultCollection implements ChannelCollection {

    private List<Channel> channels;

    public ChannelDefaultCollection() {
        channels = new ArrayList<>();
    }

    public void addChannel(Channel channel) {
        this.channels.add(channel);
    }

    public void removeChannel(Channel channel) {
        this.channels.remove(channel);
    }

    @Override
    public ChannelIterator iterator(ChannelTypeEnum type) {
        return new ChannelIteratorImpl(type, this.channels);
    }

    private class ChannelIteratorImpl implements ChannelIterator {

        private ChannelTypeEnum type;
        private List<Channel> channels;
        private int position;

        public ChannelIteratorImpl(
                ChannelTypeEnum typeEnum,
                List<Channel> channelsList
        ) {
            this.type = typeEnum;
            this.channels = channelsList;
        }

        @Override
        public boolean hasNext() {
            while (position < channels.size()) {
                Channel c = channels.get(position);
                if (c.getTYPE().equals(type) || type.equals(ChannelTypeEnum.ALL)) {
                    return true;
                } else
                    position++;
            }
            return false;
        }

        @Override
        public Channel next() {
            Channel c = channels.get(position);
            position++;
            return c;
        }

    }
}