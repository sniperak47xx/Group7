/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dk.sdu.mmmi.cbse.common.data;

import java.util.List;

/**
 *
 * @author Borgar Bordoy
 */
public interface IGameMapFunction {
    
/**
     * Get the StartX value. Which is the value from where the function starts
     * @return float StartX
     */
    float getStartX();

    /**
     * Get the Y value based on the given xValue. The Y value is calculated based on the implemented function
     * @param xValue float xValue
     * @return float YValue
     */
    float getYValue(float xValue);

    /**
     * Get the EndX value. Which is the value from where the function ends
     * @return float EndX
     */
    float getEndX();

    /**
     * Get the Y values based on the given xValues. The Y values are calculated based on the implemented function
     * @param xValues List of floats
     * @return List of floats containing yValues. Matching the index of x values.
     */
    List<Float> getYValues(List<Float> xValues);

    /**
     * Checks if the given x value is within this functions range
     * @param x
     * @return
     */
    boolean isWithin(float x);

    void setEndX(float value);

    void setStartX(float value);

    /**
     * Checks whether or not the function exists ONLY within the given range.
     * @param startX the start value for the given range
     * @param endX the end value for the given range
     * @return True/false
     */
    boolean existsOnlyWithinRange(float startX, float endX);

    /**
     * Split the function into two new functions that have two new ranges. This is used if a function needs to be split to incorporate a circle in between. Other uses may be for map generation
     * @param rangeOneStartX
     * @param rangeOneEndX
     * @param rangeTwoStartX
     * @param rangeTwoEndX
     * @return Returns two new IGameMapFunctions with identical implementation to the parent, only the range have changed. If added to the map. Remember to remove parent function.
     */
    List<IGameMapFunction> splitInTwoWithNewRanges(float rangeOneStartX, float rangeOneEndX, float rangeTwoStartX, float rangeTwoEndX);
}