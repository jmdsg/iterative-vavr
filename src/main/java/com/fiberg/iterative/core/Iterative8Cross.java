package com.fiberg.iterative.core;

import com.fiberg.iterative.core.Iterative7;
import com.fiberg.iterative.core.Iterative8;
import com.fiberg.iterative.core.IterativeHandler;
import com.fiberg.iterative.core.IterativeWrapper;
import com.fiberg.iterative.function.Cs1;
import com.fiberg.iterative.function.Cs8;
import com.fiberg.iterative.function.Fn1;
import com.fiberg.iterative.function.Fn2;
import com.fiberg.iterative.function.Pr1;
import com.fiberg.iterative.function.Rn;
import io.vavr.Tuple;
import io.vavr.Tuple8;
import io.vavr.collection.Stream;
import java.io.Serializable;

public interface Iterative8Cross<T1, T2, T3, T4, T5, T6, T7, T8> extends Iterative8<T1, T2, T3, T4, T5, T6, T7, T8> {

    @Override
    public Iterative8Cross<T1, T2, T3, T4, T5, T6, T7, T8> nonNullable();

    @Override
    public Iterative8Cross<T1, T2, T3, T4, T5, T6, T7, T8> nullable();

    @Override
    public Iterative8Cross<T1, T2, T3, T4, T5, T6, T7, T8> forceCleanEmpty1();

    @Override
    public Iterative8Cross<T1, T2, T3, T4, T5, T6, T7, T8> forceCleanEmpty2();

    @Override
    public Iterative8Cross<T1, T2, T3, T4, T5, T6, T7, T8> forceCleanEmpty3();

    @Override
    public Iterative8Cross<T1, T2, T3, T4, T5, T6, T7, T8> forceCleanEmpty4();

    @Override
    public Iterative8Cross<T1, T2, T3, T4, T5, T6, T7, T8> forceCleanEmpty5();

    @Override
    public Iterative8Cross<T1, T2, T3, T4, T5, T6, T7, T8> forceCleanEmpty6();

    @Override
    public Iterative8Cross<T1, T2, T3, T4, T5, T6, T7, T8> forceCleanEmpty7();

    @Override
    public Iterative8Cross<T1, T2, T3, T4, T5, T6, T7, T8> forceCleanEmpty8();

    @Override
    public Iterative8Cross<T1, T2, T3, T4, T5, T6, T7, T8> forceCleanEmptyAll();

    @Override
    public <R1, R2, R3, R4, R5, R6, R7, R8> Iterative8Cross<R1, R2, R3, R4, R5, R6, R7, R8> map(Fn1<? super T1, ? extends R1> var1, Fn1<? super T2, ? extends R2> var2, Fn1<? super T3, ? extends R3> var3, Fn1<? super T4, ? extends R4> var4, Fn1<? super T5, ? extends R5> var5, Fn1<? super T6, ? extends R6> var6, Fn1<? super T7, ? extends R7> var7, Fn1<? super T8, ? extends R8> var8);

    @Override
    public <R1, R2, R3, R4, R5, R6, R7, R8> Iterative8Cross<R1, R2, R3, R4, R5, R6, R7, R8> inlineMap(Fn1<? super T1, ? extends Iterable<? extends R1>> var1, Fn1<? super T2, ? extends Iterable<? extends R2>> var2, Fn1<? super T3, ? extends Iterable<? extends R3>> var3, Fn1<? super T4, ? extends Iterable<? extends R4>> var4, Fn1<? super T5, ? extends Iterable<? extends R5>> var5, Fn1<? super T6, ? extends Iterable<? extends R6>> var6, Fn1<? super T7, ? extends Iterable<? extends R7>> var7, Fn1<? super T8, ? extends Iterable<? extends R8>> var8);

    @Override
    public Iterative8Cross<T1, T2, T3, T4, T5, T6, T7, T8> filter(Pr1<? super T1> var1, Pr1<? super T2> var2, Pr1<? super T3> var3, Pr1<? super T4> var4, Pr1<? super T5> var5, Pr1<? super T6> var6, Pr1<? super T7> var7, Pr1<? super T8> var8);

    @Override
    default public Iterative8Cross<T1, T2, T3, T4, T5, T6, T7, T8> onSuccess(Rn r) {
        return (Iterative8Cross)Iterative8.super.onSuccess(r);
    }

    @Override
    default public Iterative8Cross<T1, T2, T3, T4, T5, T6, T7, T8> onFailure(Rn r) {
        return (Iterative8Cross)Iterative8.super.onFailure(r);
    }

    @Override
    default public Iterative8Cross<T1, T2, T3, T4, T5, T6, T7, T8> execute(Cs1<? super Iterative8<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6, ? extends T7, ? extends T8>> c) {
        return (Iterative8Cross)Iterative8.super.execute(c);
    }

    @Override
    default public Iterative8Cross<T1, T2, T3, T4, T5, T6, T7, T8> onFailure(Cs1<? super Iterative8<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6, ? extends T7, ? extends T8>> c) {
        return (Iterative8Cross)Iterative8.super.onFailure(c);
    }

    @Override
    default public Iterative8Cross<T1, T2, T3, T4, T5, T6, T7, T8> onSuccess(Cs1<? super Iterative8<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6, ? extends T7, ? extends T8>> c) {
        return (Iterative8Cross)Iterative8.super.onSuccess(c);
    }

    @Override
    default public Iterative8Cross<T1, T2, T3, T4, T5, T6, T7, T8> forEach(Cs8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8> c) {
        return (Iterative8Cross)Iterative8.super.forEach(c);
    }

    @Override
    default public <R> Iterative8Cross<R, T2, T3, T4, T5, T6, T7, T8> map1(Fn1<? super T1, ? extends R> f) {
        return (Iterative8Cross)Iterative8.super.map1(f);
    }

    @Override
    default public <R> Iterative8Cross<T1, R, T3, T4, T5, T6, T7, T8> map2(Fn1<? super T2, ? extends R> f) {
        return (Iterative8Cross)Iterative8.super.map2(f);
    }

    @Override
    default public <R> Iterative8Cross<T1, T2, R, T4, T5, T6, T7, T8> map3(Fn1<? super T3, ? extends R> f) {
        return (Iterative8Cross)Iterative8.super.map3(f);
    }

    @Override
    default public <R> Iterative8Cross<T1, T2, T3, R, T5, T6, T7, T8> map4(Fn1<? super T4, ? extends R> f) {
        return (Iterative8Cross)Iterative8.super.map4(f);
    }

    @Override
    default public <R> Iterative8Cross<T1, T2, T3, T4, R, T6, T7, T8> map5(Fn1<? super T5, ? extends R> f) {
        return (Iterative8Cross)Iterative8.super.map5(f);
    }

    @Override
    default public <R> Iterative8Cross<T1, T2, T3, T4, T5, R, T7, T8> map6(Fn1<? super T6, ? extends R> f) {
        return (Iterative8Cross)Iterative8.super.map6(f);
    }

    @Override
    default public <R> Iterative8Cross<T1, T2, T3, T4, T5, T6, R, T8> map7(Fn1<? super T7, ? extends R> f) {
        return (Iterative8Cross)Iterative8.super.map7(f);
    }

    @Override
    default public <R> Iterative8Cross<T1, T2, T3, T4, T5, T6, T7, R> map8(Fn1<? super T8, ? extends R> f) {
        return (Iterative8Cross)Iterative8.super.map8(f);
    }

    @Override
    default public <R> Iterative8Cross<R, T2, T3, T4, T5, T6, T7, T8> inlineMap1(Fn1<? super T1, ? extends Iterable<? extends R>> f) {
        return (Iterative8Cross)Iterative8.super.inlineMap1(f);
    }

    @Override
    default public <R> Iterative8Cross<T1, R, T3, T4, T5, T6, T7, T8> inlineMap2(Fn1<? super T2, ? extends Iterable<? extends R>> f) {
        return (Iterative8Cross)Iterative8.super.inlineMap2(f);
    }

    @Override
    default public <R> Iterative8Cross<T1, T2, R, T4, T5, T6, T7, T8> inlineMap3(Fn1<? super T3, ? extends Iterable<? extends R>> f) {
        return (Iterative8Cross)Iterative8.super.inlineMap3(f);
    }

    @Override
    default public <R> Iterative8Cross<T1, T2, T3, R, T5, T6, T7, T8> inlineMap4(Fn1<? super T4, ? extends Iterable<? extends R>> f) {
        return (Iterative8Cross)Iterative8.super.inlineMap4(f);
    }

    @Override
    default public <R> Iterative8Cross<T1, T2, T3, T4, R, T6, T7, T8> inlineMap5(Fn1<? super T5, ? extends Iterable<? extends R>> f) {
        return (Iterative8Cross)Iterative8.super.inlineMap5(f);
    }

    @Override
    default public <R> Iterative8Cross<T1, T2, T3, T4, T5, R, T7, T8> inlineMap6(Fn1<? super T6, ? extends Iterable<? extends R>> f) {
        return (Iterative8Cross)Iterative8.super.inlineMap6(f);
    }

    @Override
    default public <R> Iterative8Cross<T1, T2, T3, T4, T5, T6, R, T8> inlineMap7(Fn1<? super T7, ? extends Iterable<? extends R>> f) {
        return (Iterative8Cross)Iterative8.super.inlineMap7(f);
    }

    @Override
    default public <R> Iterative8Cross<T1, T2, T3, T4, T5, T6, T7, R> inlineMap8(Fn1<? super T8, ? extends Iterable<? extends R>> f) {
        return (Iterative8Cross)Iterative8.super.inlineMap8(f);
    }

    @Override
    default public Iterative8Cross<T1, T2, T3, T4, T5, T6, T7, T8> filter1(Pr1<? super T1> p) {
        return (Iterative8Cross)Iterative8.super.filter1(p);
    }

    @Override
    default public Iterative8Cross<T1, T2, T3, T4, T5, T6, T7, T8> filter2(Pr1<? super T2> p) {
        return (Iterative8Cross)Iterative8.super.filter2(p);
    }

    @Override
    default public Iterative8Cross<T1, T2, T3, T4, T5, T6, T7, T8> filter3(Pr1<? super T3> p) {
        return (Iterative8Cross)Iterative8.super.filter3(p);
    }

    @Override
    default public Iterative8Cross<T1, T2, T3, T4, T5, T6, T7, T8> filter4(Pr1<? super T4> p) {
        return (Iterative8Cross)Iterative8.super.filter4(p);
    }

    @Override
    default public Iterative8Cross<T1, T2, T3, T4, T5, T6, T7, T8> filter5(Pr1<? super T5> p) {
        return (Iterative8Cross)Iterative8.super.filter5(p);
    }

    @Override
    default public Iterative8Cross<T1, T2, T3, T4, T5, T6, T7, T8> filter6(Pr1<? super T6> p) {
        return (Iterative8Cross)Iterative8.super.filter6(p);
    }

    @Override
    default public Iterative8Cross<T1, T2, T3, T4, T5, T6, T7, T8> filter7(Pr1<? super T7> p) {
        return (Iterative8Cross)Iterative8.super.filter7(p);
    }

    @Override
    default public Iterative8Cross<T1, T2, T3, T4, T5, T6, T7, T8> filter8(Pr1<? super T8> p) {
        return (Iterative8Cross)Iterative8.super.filter8(p);
    }

    public static class Iterative8CrossNonNullable<T1, T2, T3, T4, T5, T6, T7, T8> extends Iterative8CrossAbst<T1, T2, T3, T4, T5, T6, T7, T8> implements Iterative8Cross<T1, T2, T3, T4, T5, T6, T7, T8>, IterativeWrapper.IterativeWrapperNonNullable, IterativeWrapper.IterativeCross {

        Iterative8CrossNonNullable(Iterative7<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6, ? extends T7> iterative, Iterable<? extends T8> right) {
            super(iterative, right);
        }

        Iterative8CrossNonNullable(Iterative7<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6, ? extends T7> iterative, Iterable<? extends Stream<? extends T8>> right, boolean ign) {
            super(iterative, right, ign);
        }

    }

    public static class Iterative8CrossNullable<T1, T2, T3, T4, T5, T6, T7, T8> extends Iterative8CrossAbst<T1, T2, T3, T4, T5, T6, T7, T8> implements Iterative8Cross<T1, T2, T3, T4, T5, T6, T7, T8>, IterativeWrapper.IterativeWrapperNullable, IterativeWrapper.IterativeCross {

        Iterative8CrossNullable(Iterative7<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6, ? extends T7> iterative, Iterable<? extends T8> right) {
            super(iterative, right);
        }

        Iterative8CrossNullable(Iterative7<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6, ? extends T7> iterative, Iterable<? extends Stream<? extends T8>> right, boolean ign) {
            super(iterative, right, ign);
        }

    }

    public static abstract class Iterative8CrossAbst<T1, T2, T3, T4, T5, T6, T7, T8> extends Iterative8.Iterative8Abst<T1, T2, T3, T4, T5, T6, T7, T8> implements Iterative8Cross<T1, T2, T3, T4, T5, T6, T7, T8> {

        Iterative8CrossAbst(Iterative7<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6, ? extends T7> iterative, Iterable<? extends T8> right) {
            super(iterative, right);
        }

        Iterative8CrossAbst(Iterative7<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6, ? extends T7> iterative, Iterable<? extends Stream<? extends T8>> right, boolean ign) {
            super(iterative, right, ign);
        }

        @Override
        public Stream<Tuple8<Iterable<T1>, Iterable<T2>, Iterable<T3>, Iterable<T4>, Iterable<T5>, Iterable<T6>, Iterable<T7>, Iterable<T8>>> toTupleStream() {
            return this.iterative.toTupleStream().crossProduct(IterativeHandler.transform(this.right)).toStream().map(Fn2.tuple((Fn2 & Serializable)(tuple, right) -> Tuple.of((Object)tuple._1(), (Object)tuple._2(), (Object)tuple._3(), (Object)tuple._4(), (Object)tuple._5(), (Object)tuple._6(), (Object)tuple._7(), (Object)right)));
        }

        @Override
        public Iterative8Cross<T1, T2, T3, T4, T5, T6, T7, T8> nonNullable() {
            return (Iterative8Cross)super.nonNullable();
        }

        @Override
        public Iterative8Cross<T1, T2, T3, T4, T5, T6, T7, T8> nullable() {
            return (Iterative8Cross)super.nullable();
        }

        @Override
        public Iterative8Cross<T1, T2, T3, T4, T5, T6, T7, T8> forceCleanEmpty1() {
            return (Iterative8Cross)super.forceCleanEmpty1();
        }

        @Override
        public Iterative8Cross<T1, T2, T3, T4, T5, T6, T7, T8> forceCleanEmpty2() {
            return (Iterative8Cross)super.forceCleanEmpty2();
        }

        @Override
        public Iterative8Cross<T1, T2, T3, T4, T5, T6, T7, T8> forceCleanEmpty3() {
            return (Iterative8Cross)super.forceCleanEmpty3();
        }

        @Override
        public Iterative8Cross<T1, T2, T3, T4, T5, T6, T7, T8> forceCleanEmpty4() {
            return (Iterative8Cross)super.forceCleanEmpty4();
        }

        @Override
        public Iterative8Cross<T1, T2, T3, T4, T5, T6, T7, T8> forceCleanEmpty5() {
            return (Iterative8Cross)super.forceCleanEmpty5();
        }

        @Override
        public Iterative8Cross<T1, T2, T3, T4, T5, T6, T7, T8> forceCleanEmpty6() {
            return (Iterative8Cross)super.forceCleanEmpty6();
        }

        @Override
        public Iterative8Cross<T1, T2, T3, T4, T5, T6, T7, T8> forceCleanEmpty7() {
            return (Iterative8Cross)super.forceCleanEmpty7();
        }

        @Override
        public Iterative8Cross<T1, T2, T3, T4, T5, T6, T7, T8> forceCleanEmpty8() {
            return (Iterative8Cross)super.forceCleanEmpty8();
        }

        @Override
        public Iterative8Cross<T1, T2, T3, T4, T5, T6, T7, T8> forceCleanEmptyAll() {
            return (Iterative8Cross)super.forceCleanEmptyAll();
        }

        @Override
        public <R1, R2, R3, R4, R5, R6, R7, R8> Iterative8Cross<R1, R2, R3, R4, R5, R6, R7, R8> map(Fn1<? super T1, ? extends R1> f1, Fn1<? super T2, ? extends R2> f2, Fn1<? super T3, ? extends R3> f3, Fn1<? super T4, ? extends R4> f4, Fn1<? super T5, ? extends R5> f5, Fn1<? super T6, ? extends R6> f6, Fn1<? super T7, ? extends R7> f7, Fn1<? super T8, ? extends R8> f8) {
            return (Iterative8Cross)super.map(f1, f2, f3, f4, f5, f6, f7, f8);
        }

        @Override
        public <R1, R2, R3, R4, R5, R6, R7, R8> Iterative8Cross<R1, R2, R3, R4, R5, R6, R7, R8> inlineMap(Fn1<? super T1, ? extends Iterable<? extends R1>> f1, Fn1<? super T2, ? extends Iterable<? extends R2>> f2, Fn1<? super T3, ? extends Iterable<? extends R3>> f3, Fn1<? super T4, ? extends Iterable<? extends R4>> f4, Fn1<? super T5, ? extends Iterable<? extends R5>> f5, Fn1<? super T6, ? extends Iterable<? extends R6>> f6, Fn1<? super T7, ? extends Iterable<? extends R7>> f7, Fn1<? super T8, ? extends Iterable<? extends R8>> f8) {
            return (Iterative8Cross)super.inlineMap(f1, f2, f3, f4, f5, f6, f7, f8);
        }

        @Override
        public Iterative8Cross<T1, T2, T3, T4, T5, T6, T7, T8> filter(Pr1<? super T1> p1, Pr1<? super T2> p2, Pr1<? super T3> p3, Pr1<? super T4> p4, Pr1<? super T5> p5, Pr1<? super T6> p6, Pr1<? super T7> p7, Pr1<? super T8> p8) {
            return (Iterative8Cross)super.filter(p1, p2, p3, p4, p5, p6, p7, p8);
        }

    }

}
