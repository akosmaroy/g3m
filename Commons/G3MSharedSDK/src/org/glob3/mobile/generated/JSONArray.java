

package org.glob3.mobile.generated;

//
// JSONArray.cpp
// G3MiOSSDK
//
// Created by Oliver Koehler on 02/10/12.
// Copyright (c) 2012 __MyCompanyName__. All rights reserved.
//

//
// JSONArray.hpp
// G3MiOSSDK
//
// Created by Oliver Koehler on 02/10/12.
// Copyright (c) 2012 __MyCompanyName__. All rights reserved.
//


public class JSONArray
    extends
      JSONBaseObject {
  private final java.util.ArrayList<JSONBaseObject> _entries = new java.util.ArrayList<JSONBaseObject>();


  // C++ TO JAVA CONVERTER WARNING: 'const' methods are not available in
  // Java:
  // ORIGINAL LINE: const JSONArray* asArray() const
  @Override
  public final JSONArray asArray() {
    return this;
  }


  @Override
  public void dispose() {
    for (int i = 0; i < _entries.size(); i++) {
      if (_entries.get(i) != null) {
        _entries.get(i).dispose();
      }
    }
    _entries.clear();
  }


  // C++ TO JAVA CONVERTER WARNING: 'const' methods are not available in
  // Java:
  // ORIGINAL LINE: const JSONBaseObject* get(const int index) const
  public final JSONBaseObject get(final int index) {
    return _entries.get(index);
  }


  // C++ TO JAVA CONVERTER WARNING: 'const' methods are not available in
  // Java:
  // ORIGINAL LINE: const JSONObject* getAsObject(const int index) const
  public final JSONObject getAsObject(final int index) {
    final JSONBaseObject object = get(index);
    return (object == null) ? null : object.asObject();
  }


  // C++ TO JAVA CONVERTER WARNING: 'const' methods are not available in
  // Java:
  // ORIGINAL LINE: const JSONArray* getAsArray(const int index) const
  public final JSONArray getAsArray(final int index) {
    final JSONBaseObject object = get(index);
    return (object == null) ? null : object.asArray();
  }


  // C++ TO JAVA CONVERTER WARNING: 'const' methods are not available in
  // Java:
  // ORIGINAL LINE: const JSONBoolean* getAsBoolean(const int index) const
  public final JSONBoolean getAsBoolean(final int index) {
    final JSONBaseObject object = get(index);
    return (object == null) ? null : object.asBoolean();
  }


  // C++ TO JAVA CONVERTER WARNING: 'const' methods are not available in
  // Java:
  // ORIGINAL LINE: const JSONNumber* getAsNumber(const int index) const
  public final JSONNumber getAsNumber(final int index) {
    final JSONBaseObject object = get(index);
    return (object == null) ? null : object.asNumber();
  }


  // C++ TO JAVA CONVERTER WARNING: 'const' methods are not available in
  // Java:
  // ORIGINAL LINE: const JSONString* getAsString(const int index) const
  public final JSONString getAsString(final int index) {
    final JSONBaseObject object = get(index);
    return (object == null) ? null : object.asString();
  }


  // C++ TO JAVA CONVERTER WARNING: 'const' methods are not available in
  // Java:
  // ORIGINAL LINE: boolean getAsBoolean(const int index, boolean
  // defaultValue) const
  public final boolean getAsBoolean(final int index,
                                    final boolean defaultValue) {
    final JSONBoolean jsBool = getAsBoolean(index);
    return (jsBool == null) ? defaultValue : jsBool.value();
  }


  // C++ TO JAVA CONVERTER WARNING: 'const' methods are not available in
  // Java:
  // ORIGINAL LINE: double getAsNumber(const int index, double defaultValue)
  // const
  public final double getAsNumber(final int index,
                                  final double defaultValue) {
    final JSONNumber jsNumber = getAsNumber(index);
    return (jsNumber == null) ? defaultValue : jsNumber.value();
  }


  // C++ TO JAVA CONVERTER WARNING: 'const' methods are not available in
  // Java:
  // ORIGINAL LINE: const String getAsString(const int index, const String&
  // defaultValue) const
  public final String getAsString(final int index,
                                  final String defaultValue) {
    final JSONString jsString = getAsString(index);
    return (jsString == null) ? defaultValue : jsString.value();
  }


  // C++ TO JAVA CONVERTER WARNING: 'const' methods are not available in
  // Java:
  // ORIGINAL LINE: int size() const
  public final int size() {
    return _entries.size();
  }


  public final void add(final JSONBaseObject object) {
    _entries.add(object);
  }


  // C++ TO JAVA CONVERTER WARNING: 'const' methods are not available in
  // Java:
  // ORIGINAL LINE: const String description() const
  @Override
  public final String description() {
    final IStringBuilder isb = IStringBuilder.newStringBuilder();

    final int size = this.size();

    isb.addString("[");
    // isb->addString("[size=");
    // isb->addInt(size);

    if (size > 0) {
      // isb->addString(" ");
      // TODO: IN CORE
      isb.addString((this.get(0) == null) ? "null" : this.get(0).description());

      if (size <= 10) {
        for (int i = 1; i < size; i++) {
          isb.addString(", ");
          // TODO: IN CORE
          isb.addString((this.get(i) == null) ? "null"
                                             : this.get(i).description());
        }
      }
      else {
        for (int i = 1; i < 10; i++) {
          isb.addString(", ");
          // TODO: IN CORE
          isb.addString((this.get(i) == null) ? "null"
                                             : this.get(i).description());
        }
        isb.addString(", ...");
        isb.addString(" size=");
        isb.addInt(size);

      }
    }

    isb.addString("]");

    final String s = isb.getString();
    if (isb != null) {
      isb.dispose();
    }
    return s;
  }


  // C++ TO JAVA CONVERTER WARNING: 'const' methods are not available in
  // Java:
  // ORIGINAL LINE: JSONArray* deepCopy() const
  @Override
  public final JSONArray deepCopy() {
    final JSONArray result = new JSONArray();

    final int size = this.size();
    for (int i = 0; i < size; i++) {
      result.add(JSONBaseObject.deepCopy(get(i)));
    }

    return result;
  }


  // C++ TO JAVA CONVERTER WARNING: 'const' methods are not available in
  // Java:
  // ORIGINAL LINE: void acceptVisitor(JSONVisitor* visitor) const
  @Override
  public final void acceptVisitor(final JSONVisitor visitor) {
    visitor.visitArrayBeforeChildren(this);

    final int size = this.size();
    for (int i = 0; i < size; i++) {
      if (i != 0) {
        visitor.visitArrayInBetweenChildren(this);
      }
      visitor.visitArrayBeforeChild(this, i);
      // TODO: IN CORE
      if (get(i) != null) {
        get(i).acceptVisitor(visitor);
      }
    }

    visitor.visitArrayAfterChildren(this);
  }

}
