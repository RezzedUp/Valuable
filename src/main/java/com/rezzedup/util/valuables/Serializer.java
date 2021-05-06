/*
 * Copyright © 2021, RezzedUp <https://github.com/RezzedUp/Valuables>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package com.rezzedup.util.valuables;

import pl.tlinkowski.annotation.basic.NullOr;

@FunctionalInterface
public interface Serializer<D, S>
{
    @SuppressWarnings("unchecked")
    static <D, S> Serializer<D, S> cast()
    {
        return deserialized -> (S) deserialized;
    }
    
    @NullOr S serialize(D deserialized);
}
