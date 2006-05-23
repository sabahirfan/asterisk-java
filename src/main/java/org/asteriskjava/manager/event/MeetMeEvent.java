/*
 *  Copyright 2004-2006 Stefan Reuter
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 */
package org.asteriskjava.manager.event;

/**
 * Abstract base class providing common properties for MeetMe
 * (Asterisk's conference system) events.
 * 
 * @author srt
 * @version $Id$
 */
public abstract class MeetMeEvent extends ManagerEvent
{
    private String channel;
    private String uniqueId;
    private String meetMe;
    private Integer userNum;

    /**
     * @param source
     */
    public MeetMeEvent(Object source)
    {
        super(source);
    }

    /**
     * Returns the name of the channel.<br>
     * This property is available since Asterisk 1.4.
     * 
     * @return the name of the channel.
     */
    public String getChannel()
    {
        return channel;
    }

    /**
     * Sets the name of the channel.<br>
     * This property is available since Asterisk 1.4.
     * 
     * @param channel the name of the channel.
     */
    public void setChannel(String channel)
    {
        this.channel = channel;
    }

    /**
     * Returns the unique id of the channel.<br>
     * This property is available since Asterisk 1.4.
     * 
     * @return the unique id of the channel.
     */
    public String getUniqueId()
    {
        return uniqueId;
    }

    /**
     * Sets the unique id of the channel.<br>
     * This property is available since Asterisk 1.4.
     * 
     * @param uniqueId the unique id of the channel.
     */
    public void setUniqueId(String uniqueId)
    {
        this.uniqueId = uniqueId;
    }

    /**
     * Returns the conference number.
     * 
     * @return the conference number.
     */
    public String getMeetMe()
    {
        return meetMe;
    }

    /**
     * Sets the conference number.
     * 
     * @param meetMe the conference number.
     */
    public void setMeetMe(String meetMe)
    {
        this.meetMe = meetMe;
    }

    /**
     * Returns the index of the user in the conference.<br>
     * This can be used for the "meetme (mute|unmute|kick)" commands.
     * 
     * @return the index of the user in the conference.
     */
    public Integer getUserNum()
    {
        return userNum;
    }

    /**
     * Sets the index of the user in the conference.
     * 
     * @param userNum the index of the user in the conference.
     */
    public void setUserNum(Integer userNum)
    {
        this.userNum = userNum;
    }
}
