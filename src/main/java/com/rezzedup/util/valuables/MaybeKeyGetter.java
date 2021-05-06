/*
 * Copyright © 2021, RezzedUp <https://github.com/RezzedUp/Valuables>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package com.rezzedup.util.valuables;

import java.util.Objects;
import java.util.Optional;

@FunctionalInterface
public interface MaybeKeyGetter<S, K, V>
{
    static <S, K, V> MaybeKeyGetter<S, K, V> maybe(KeyGetter<S, K, V> getter)
    {
        Objects.requireNonNull(getter, "getter");
        return (storage, key) -> Optional.ofNullable(getter.get(storage, key));
    }
    
    Optional<V> get(S storage, K key);
}
