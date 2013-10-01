/**
 *
 * Copyright (c) 2009-2013 Freedomotic team http://freedomotic.com
 *
 * This file is part of Freedomotic
 *
 * This Program is free software; you can redistribute it and/or modify it under
 * the terms of the GNU General Public License as published by the Free Software
 * Foundation; either version 2, or (at your option) any later version.
 *
 * This Program is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU General Public License for more
 * details.
 *
 * You should have received a copy of the GNU General Public License along with
 * Freedomotic; see the file COPYING. If not, see
 * <http://www.gnu.org/licenses/>.
 */
package it.cicolella.phwswethv2;

public class Board {

    private String ipAddress = null;
    private String ledTag;
    private String analogInputTag;
    private String digitalInputTag;
    private String autoConfiguration;
    private String objectClass;
    private String alias = null;
    private String monitorRelay = null;
    private String monitorAnalogInput = null;
    private String monitorDigitalInput = null;
    private int port;
    private int relayNumber;
    private int analogInputNumber;
    private int digitalInputNumber;
    private int startingRelay;
    private int[] relayStatus;
    private String[] digitalInputValues;
    private int[] analogInputValues;

    public Board(String ipAddress, int port, String alias, int relayNumber, int analogInputNumber,
            int digitalInputNumber, int startingRelay, String ledTag, String digitalInputTag, String analogInputTag, String autoConfiguration, String objectClass,
            String monitorRelay, String monitorAnalogInput, String monitorDigitalInput) {
        setIpAddress(ipAddress);
        setPort(port);
        setAlias(alias);
        setRelayNumber(relayNumber);
        setAnalogInputNumber(analogInputNumber);
        setDigitalInputNumber(digitalInputNumber);
        setStartingRelay(startingRelay);
        setLedTag(ledTag);
        setDigitalInputTag(digitalInputTag);
        setAnalogInputTag(analogInputTag);
        setAutoConfiguration(autoConfiguration);
        setObjectClass(objectClass);
        setMonitorRelay(monitorRelay);
        setMonitorAnalogInput(monitorAnalogInput);
        setMonitorDigitalInput(monitorDigitalInput);
        initializeRelayStatus(relayNumber);
        initializeDigitalInputValues(digitalInputNumber);
        initializeAnalogInputValues(analogInputNumber);
    }

    public int getAnalogInputNumber() {
        return analogInputNumber;
    }

    public void setAnalogInputNumber(int analogInputNumber) {
        this.analogInputNumber = analogInputNumber;
    }

    public int getDigitalInputNumber() {
        return digitalInputNumber;
    }

    public void setDigitalInputNumber(int digitalInputNumber) {
        this.digitalInputNumber = digitalInputNumber;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public String getLedTag() {
        return ledTag;
    }

    public void setLedTag(String ledTag) {
        this.ledTag = ledTag;
    }

    public String getAnalogInputTag() {
        return analogInputTag;
    }

    public void setAnalogInputTag(String analogInputTag) {
        this.analogInputTag = analogInputTag;
    }

    public void setMonitorRelay(String monitorRelay) {
        this.monitorRelay = monitorRelay;
    }

    public void setAnalogInput(String monitorAnalogInput) {
        this.monitorAnalogInput = monitorAnalogInput;
    }

    public void setMonitorDigitalInput(String monitorDigitalInput) {
        this.monitorDigitalInput = monitorDigitalInput;
    }
    
    public void setMonitorAnalogInput(String monitorAnalogInput) {
        this.monitorAnalogInput = monitorAnalogInput;
    }

    public String getDigitalInputTag() {
        return digitalInputTag;
    }

    public void setDigitalInputTag(String digitalInputTag) {
        this.digitalInputTag = digitalInputTag;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public int getRelayNumber() {
        return relayNumber;
    }

    public void setRelayNumber(int relayNumber) {
        this.relayNumber = relayNumber;
    }

    public int getStartingRelay() {
        return startingRelay;
    }

    public void setStartingRelay(int startingRelay) {
        this.startingRelay = startingRelay;
    }

    public String getAutoConfiguration() {
        return autoConfiguration;
    }

    public String getMonitorRelay() {
        return monitorRelay;
    }

    public String getMonitorAnalogInput() {
        return monitorAnalogInput;
    }

    public String getMonitorDigitalInput() {
        return monitorDigitalInput;
    }

    public void setAutoConfiguration(String autoConfiguration) {
        this.autoConfiguration = autoConfiguration;
    }

    public String getObjectClass() {
        return objectClass;
    }

    public void setObjectClass(String objectClass) {
        this.objectClass = objectClass;
    }

    public int getRelayStatus(int relayNumber) {
        return relayStatus[relayNumber];
    }

    public void setRelayStatus(int relayNumber, int value) {
        relayStatus[relayNumber] = value;
    }

    public String getDigitalInputValue(int digitalInputNumber) {
        return digitalInputValues[digitalInputNumber];
    }

    public void setDigitalInputValue(int digitalInputNumber, String value) {
        digitalInputValues[digitalInputNumber] = value;
    }

    public int getAnalogInputValue(int analogInputNumber) {
        return analogInputValues[analogInputNumber];
    }

    public void setAnalogInputValue(int analogInputNumber, int value) {
        analogInputValues[analogInputNumber] = value;
    }

    private void initializeRelayStatus(int relayNumber) {
        relayStatus = new int[relayNumber];
        for (int i = 0; i < relayNumber; i++) {
            relayStatus[i] = -1;
        }
    }

    private void initializeDigitalInputValues(int digitalInputNumber) {
        digitalInputValues = new String[digitalInputNumber];
        for (int i = 0; i < digitalInputNumber; i++) {
            digitalInputValues[i] = "up";
        }
    }

    private void initializeAnalogInputValues(int analogInputNumber) {
        analogInputValues = new int[analogInputNumber];
        for (int i = 0; i < analogInputNumber; i++) {
            analogInputValues[i] = 0;
        }
    }
}
