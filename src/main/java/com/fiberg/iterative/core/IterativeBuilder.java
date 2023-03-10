package com.fiberg.iterative.core;

import io.vavr.*;
import io.vavr.collection.Stream;
import io.vavr.control.Option;

interface IterativeBuilder {

    public static class BuilderRegularImpl extends BuilderRegularCrossAbstract implements RegularBuilder {

        BuilderRegularImpl() {
            this.argument = Argument.REGULAR;
        }

        @Override
        public IterativeBuilderArgAccRegCro cross() {
            final BuilderRegularArgAccRegCroImpl builder = new BuilderRegularArgAccRegCroImpl();
            builder.iterate = this.iterate;
            builder.access = this.access;
            builder.argument = this.argument;
            return builder;
        }

        @Override
        public IterativeBuilderArgAccRegInl inline() {
            final BuilderRegularArgAccRegInlImpl builder = new BuilderRegularArgAccRegInlImpl();
            builder.iterate = this.iterate;
            builder.access = this.access;
            builder.argument = this.argument;
            return builder;
        }

        @Override
        public IterativeBuilderIteArgReg nullable() {
            this.access = Access.NULLABLE;
            return this;
        }

        @Override
        public IterativeBuilderIteArgReg nonNullable() {
            this.access = Access.NON_NULLABLE;
            return this;
        }

        @Override
        public IterativeBuilderIteAccReg regularArgs() {
            this.argument = Argument.REGULAR;
            return this;
        }

        @Override
        public IterativeBuilderIteAccTup tupleArgs() {
            final BuilderTupleCrossImpl builder = new BuilderTupleCrossImpl();
            builder.iterate = this.iterate;
            builder.access = this.access;
            builder.argument = this.argument;
            return builder;
        }

    }

    public static class BuilderRegularArgAccRegCroImpl extends BuilderRegularCrossAbstract implements IterativeBuilderArgAccRegCro {

        BuilderRegularArgAccRegCroImpl() {
            this.iterate = Iterate.CROSS;
        }

        @Override
        public IterativeBuilderArgRegCro nullable() {
            this.access = Access.NULLABLE;
            return this;
        }

        @Override
        public IterativeBuilderArgRegCro nonNullable() {
            this.access = Access.NON_NULLABLE;
            return this;
        }

        @Override
        public IterativeBuilderAccRegCro regularArgs() {
            this.argument = Argument.REGULAR;
            return this;
        }

        @Override
        public IterativeBuilderAccTupCro tupleArgs() {
            final BuilderTupleAccTupCroImpl builder = new BuilderTupleAccTupCroImpl();
            builder.iterate = this.iterate;
            builder.access = this.access;
            builder.argument = this.argument;
            return builder;
        }

    }

    public static class BuilderRegularArgAccRegInlImpl extends BuilderRegularInlineAbstract implements IterativeBuilderArgAccRegInl {

        BuilderRegularArgAccRegInlImpl() {
            this.iterate = Iterate.INLINE;
        }

        @Override
        public IterativeBuilderArgRegInl nullable() {
            this.access = Access.NULLABLE;
            return this;
        }

        @Override
        public IterativeBuilderArgRegInl nonNullable() {
            this.access = Access.NON_NULLABLE;
            return this;
        }

        @Override
        public IterativeBuilderAccRegInl regularArgs() {
            this.argument = Argument.REGULAR;
            return this;
        }

        @Override
        public IterativeBuilderAccTupInl tupleArgs() {
            final BuilderTupleAccTupInlImpl builder = new BuilderTupleAccTupInlImpl();
            builder.iterate = this.iterate;
            builder.access = this.access;
            builder.argument = this.argument;
            return builder;
        }

    }

    public static class BuilderTupleCrossImpl extends BuilderTupleCrossAbstract implements IterativeBuilderIteAccTup {

        BuilderTupleCrossImpl() {
            this.argument = Argument.TUPLE;
        }

        @Override
        public IterativeBuilderIteTup nullable() {
            this.access = Access.NULLABLE;
            return this;
        }

        @Override
        public IterativeBuilderIteTup nonNullable() {
            this.access = Access.NON_NULLABLE;
            return this;
        }

        @Override
        public IterativeBuilderAccTupCro cross() {
            final BuilderTupleAccTupCroImpl builder = new BuilderTupleAccTupCroImpl();
            builder.iterate = this.iterate;
            builder.access = this.access;
            builder.argument = this.argument;
            return builder;
        }

        @Override
        public IterativeBuilderAccTupInl inline() {
            final BuilderTupleAccTupInlImpl builder = new BuilderTupleAccTupInlImpl();
            builder.iterate = this.iterate;
            builder.access = this.access;
            builder.argument = this.argument;
            return builder;
        }

    }

    public static class BuilderTupleAccTupInlImpl extends BuilderTupleInlineAbstract implements IterativeBuilderAccTupInl {

        BuilderTupleAccTupInlImpl() {
            this.argument = Argument.TUPLE;
            this.iterate = Iterate.INLINE;
        }

        @Override
        public IterativeBuilderTupleInline nullable() {
            this.access = Access.NULLABLE;
            return this;
        }

        @Override
        public IterativeBuilderTupleInline nonNullable() {
            this.access = Access.NON_NULLABLE;
            return this;
        }

    }

    public static class BuilderTupleAccTupCroImpl extends BuilderTupleCrossAbstract implements IterativeBuilderAccTupCro {

        BuilderTupleAccTupCroImpl() {
            this.argument = Argument.TUPLE;
            this.iterate = Iterate.CROSS;
        }

        @Override
        public IterativeBuilderTupleCross nullable() {
            this.access = Access.NULLABLE;
            return this;
        }

        @Override
        public IterativeBuilderTupleCross nonNullable() {
            this.access = Access.NON_NULLABLE;
            return this;
        }

    }

    public static abstract class BuilderTupleInlineAbstract extends BuilderRegularInlineAbstract implements IterativeBuilderTupleInline {

        @Override
        public <T1> Iterative1<T1> from(Tuple1<? extends T1> tuple) {
            return this.from(tuple._1());
        }

        @Override
        public <T1, T2> Iterative2Inline<T1, T2> from(Tuple2<? extends T1, ? extends T2> tuple) {
            return this.from(tuple._1(), tuple._2());
        }

        @Override
        public <T1, T2, T3> Iterative3Inline<T1, T2, T3> from(Tuple3<? extends T1, ? extends T2, ? extends T3> tuple) {
            return this.from(tuple._1(), tuple._2(), tuple._3());
        }

        @Override
        public <T1, T2, T3, T4> Iterative4Inline<T1, T2, T3, T4> from(Tuple4<? extends T1, ? extends T2, ? extends T3, ? extends T4> tuple) {
            return this.from(tuple._1(), tuple._2(), tuple._3(), tuple._4());
        }

        @Override
        public <T1, T2, T3, T4, T5> Iterative5Inline<T1, T2, T3, T4, T5> from(Tuple5<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5> tuple) {
            return this.from(tuple._1(), tuple._2(), tuple._3(), tuple._4(), tuple._5());
        }

        @Override
        public <T1, T2, T3, T4, T5, T6> Iterative6Inline<T1, T2, T3, T4, T5, T6> from(Tuple6<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6> tuple) {
            return this.from(tuple._1(), tuple._2(), tuple._3(), tuple._4(), tuple._5(), tuple._6());
        }

        @Override
        public <T1, T2, T3, T4, T5, T6, T7> Iterative7Inline<T1, T2, T3, T4, T5, T6, T7> from(Tuple7<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6, ? extends T7> tuple) {
            return this.from(tuple._1(), tuple._2(), tuple._3(), tuple._4(), tuple._5(), tuple._6(), tuple._7());
        }

        @Override
        public <T1, T2, T3, T4, T5, T6, T7, T8> Iterative8Inline<T1, T2, T3, T4, T5, T6, T7, T8> from(Tuple8<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6, ? extends T7, ? extends T8> tuple) {
            return this.from(tuple._1(), tuple._2(), tuple._3(), tuple._4(), tuple._5(), tuple._6(), tuple._7(), tuple._8());
        }

        @Override
        public <T1> Iterative1<T1> of(Tuple1<? extends Iterable<? extends T1>> tuple) {
            return this.of(tuple._1());
        }

        @Override
        public <T1, T2> Iterative2Inline<T1, T2> of(Tuple2<? extends Iterable<? extends T1>, ? extends Iterable<? extends T2>> tuple) {
            return this.of(tuple._1(), tuple._2());
        }

        @Override
        public <T1, T2, T3> Iterative3Inline<T1, T2, T3> of(Tuple3<? extends Iterable<? extends T1>, ? extends Iterable<? extends T2>, ? extends Iterable<? extends T3>> tuple) {
            return this.of(tuple._1(), tuple._2(), tuple._3());
        }

        @Override
        public <T1, T2, T3, T4> Iterative4Inline<T1, T2, T3, T4> of(Tuple4<? extends Iterable<? extends T1>, ? extends Iterable<? extends T2>, ? extends Iterable<? extends T3>, ? extends Iterable<? extends T4>> tuple) {
            return this.of(tuple._1(), tuple._2(), tuple._3(), tuple._4());
        }

        @Override
        public <T1, T2, T3, T4, T5> Iterative5Inline<T1, T2, T3, T4, T5> of(Tuple5<? extends Iterable<? extends T1>, ? extends Iterable<? extends T2>, ? extends Iterable<? extends T3>, ? extends Iterable<? extends T4>, ? extends Iterable<? extends T5>> tuple) {
            return this.of(tuple._1(), tuple._2(), tuple._3(), tuple._4(), tuple._5());
        }

        @Override
        public <T1, T2, T3, T4, T5, T6> Iterative6Inline<T1, T2, T3, T4, T5, T6> of(Tuple6<? extends Iterable<? extends T1>, ? extends Iterable<? extends T2>, ? extends Iterable<? extends T3>, ? extends Iterable<? extends T4>, ? extends Iterable<? extends T5>, ? extends Iterable<? extends T6>> tuple) {
            return this.of(tuple._1(), tuple._2(), tuple._3(), tuple._4(), tuple._5(), tuple._6());
        }

        @Override
        public <T1, T2, T3, T4, T5, T6, T7> Iterative7Inline<T1, T2, T3, T4, T5, T6, T7> of(Tuple7<? extends Iterable<? extends T1>, ? extends Iterable<? extends T2>, ? extends Iterable<? extends T3>, ? extends Iterable<? extends T4>, ? extends Iterable<? extends T5>, ? extends Iterable<? extends T6>, ? extends Iterable<? extends T7>> tuple) {
            return this.of(tuple._1(), tuple._2(), tuple._3(), tuple._4(), tuple._5(), tuple._6(), tuple._7());
        }

        @Override
        public <T1, T2, T3, T4, T5, T6, T7, T8> Iterative8Inline<T1, T2, T3, T4, T5, T6, T7, T8> of(Tuple8<? extends Iterable<? extends T1>, ? extends Iterable<? extends T2>, ? extends Iterable<? extends T3>, ? extends Iterable<? extends T4>, ? extends Iterable<? extends T5>, ? extends Iterable<? extends T6>, ? extends Iterable<? extends T7>, ? extends Iterable<? extends T8>> tuple) {
            return this.of(tuple._1(), tuple._2(), tuple._3(), tuple._4(), tuple._5(), tuple._6(), tuple._7(), tuple._8());
        }

    }

    public static abstract class BuilderTupleCrossAbstract extends BuilderRegularCrossAbstract implements IterativeBuilderTupleCross {

        @Override
        public <T1> Iterative1<T1> from(Tuple1<? extends T1> tuple) {
            return this.from(tuple._1());
        }

        @Override
        public <T1, T2> Iterative2Cross<T1, T2> from(Tuple2<? extends T1, ? extends T2> tuple) {
            return this.from(tuple._1(), tuple._2());
        }

        @Override
        public <T1, T2, T3> Iterative3Cross<T1, T2, T3> from(Tuple3<? extends T1, ? extends T2, ? extends T3> tuple) {
            return this.from(tuple._1(), tuple._2(), tuple._3());
        }

        @Override
        public <T1, T2, T3, T4> Iterative4Cross<T1, T2, T3, T4> from(Tuple4<? extends T1, ? extends T2, ? extends T3, ? extends T4> tuple) {
            return this.from(tuple._1(), tuple._2(), tuple._3(), tuple._4());
        }

        @Override
        public <T1, T2, T3, T4, T5> Iterative5Cross<T1, T2, T3, T4, T5> from(Tuple5<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5> tuple) {
            return this.from(tuple._1(), tuple._2(), tuple._3(), tuple._4(), tuple._5());
        }

        @Override
        public <T1, T2, T3, T4, T5, T6> Iterative6Cross<T1, T2, T3, T4, T5, T6> from(Tuple6<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6> tuple) {
            return this.from(tuple._1(), tuple._2(), tuple._3(), tuple._4(), tuple._5(), tuple._6());
        }

        @Override
        public <T1, T2, T3, T4, T5, T6, T7> Iterative7Cross<T1, T2, T3, T4, T5, T6, T7> from(Tuple7<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6, ? extends T7> tuple) {
            return this.from(tuple._1(), tuple._2(), tuple._3(), tuple._4(), tuple._5(), tuple._6(), tuple._7());
        }

        @Override
        public <T1, T2, T3, T4, T5, T6, T7, T8> Iterative8Cross<T1, T2, T3, T4, T5, T6, T7, T8> from(Tuple8<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6, ? extends T7, ? extends T8> tuple) {
            return this.from(tuple._1(), tuple._2(), tuple._3(), tuple._4(), tuple._5(), tuple._6(), tuple._7(), tuple._8());
        }

        @Override
        public <T1> Iterative1<T1> of(Tuple1<? extends Iterable<? extends T1>> tuple) {
            return this.of(tuple._1());
        }

        @Override
        public <T1, T2> Iterative2Cross<T1, T2> of(Tuple2<? extends Iterable<? extends T1>, ? extends Iterable<? extends T2>> tuple) {
            return this.of(tuple._1(), tuple._2());
        }

        @Override
        public <T1, T2, T3> Iterative3Cross<T1, T2, T3> of(Tuple3<? extends Iterable<? extends T1>, ? extends Iterable<? extends T2>, ? extends Iterable<? extends T3>> tuple) {
            return this.of(tuple._1(), tuple._2(), tuple._3());
        }

        @Override
        public <T1, T2, T3, T4> Iterative4Cross<T1, T2, T3, T4> of(Tuple4<? extends Iterable<? extends T1>, ? extends Iterable<? extends T2>, ? extends Iterable<? extends T3>, ? extends Iterable<? extends T4>> tuple) {
            return this.of(tuple._1(), tuple._2(), tuple._3(), tuple._4());
        }

        @Override
        public <T1, T2, T3, T4, T5> Iterative5Cross<T1, T2, T3, T4, T5> of(Tuple5<? extends Iterable<? extends T1>, ? extends Iterable<? extends T2>, ? extends Iterable<? extends T3>, ? extends Iterable<? extends T4>, ? extends Iterable<? extends T5>> tuple) {
            return this.of(tuple._1(), tuple._2(), tuple._3(), tuple._4(), tuple._5());
        }

        @Override
        public <T1, T2, T3, T4, T5, T6> Iterative6Cross<T1, T2, T3, T4, T5, T6> of(Tuple6<? extends Iterable<? extends T1>, ? extends Iterable<? extends T2>, ? extends Iterable<? extends T3>, ? extends Iterable<? extends T4>, ? extends Iterable<? extends T5>, ? extends Iterable<? extends T6>> tuple) {
            return this.of(tuple._1(), tuple._2(), tuple._3(), tuple._4(), tuple._5(), tuple._6());
        }

        @Override
        public <T1, T2, T3, T4, T5, T6, T7> Iterative7Cross<T1, T2, T3, T4, T5, T6, T7> of(Tuple7<? extends Iterable<? extends T1>, ? extends Iterable<? extends T2>, ? extends Iterable<? extends T3>, ? extends Iterable<? extends T4>, ? extends Iterable<? extends T5>, ? extends Iterable<? extends T6>, ? extends Iterable<? extends T7>> tuple) {
            return this.of(tuple._1(), tuple._2(), tuple._3(), tuple._4(), tuple._5(), tuple._6(), tuple._7());
        }

        @Override
        public <T1, T2, T3, T4, T5, T6, T7, T8> Iterative8Cross<T1, T2, T3, T4, T5, T6, T7, T8> of(Tuple8<? extends Iterable<? extends T1>, ? extends Iterable<? extends T2>, ? extends Iterable<? extends T3>, ? extends Iterable<? extends T4>, ? extends Iterable<? extends T5>, ? extends Iterable<? extends T6>, ? extends Iterable<? extends T7>, ? extends Iterable<? extends T8>> tuple) {
            return this.of(tuple._1(), tuple._2(), tuple._3(), tuple._4(), tuple._5(), tuple._6(), tuple._7(), tuple._8());
        }

    }

    public static abstract class BuilderRegularInlineAbstract extends BuilderAbstract implements IterativeBuilderRegularInline {

        @Override
        public <T1, T2> Iterative2Inline<T1, T2> from(T1 t1, T2 t2) {
            return this.of(this.wrap(t1), this.wrap(t2));
        }

        @Override
        public <T1, T2, T3> Iterative3Inline<T1, T2, T3> from(T1 t1, T2 t2, T3 t3) {
            return this.of(this.wrap(t1), this.wrap(t2), this.wrap(t3));
        }

        @Override
        public <T1, T2, T3, T4> Iterative4Inline<T1, T2, T3, T4> from(T1 t1, T2 t2, T3 t3, T4 t4) {
            return this.of(this.wrap(t1), this.wrap(t2), this.wrap(t3), this.wrap(t4));
        }

        @Override
        public <T1, T2, T3, T4, T5> Iterative5Inline<T1, T2, T3, T4, T5> from(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5) {
            return this.of(this.wrap(t1), this.wrap(t2), this.wrap(t3), this.wrap(t4), this.wrap(t5));
        }

        @Override
        public <T1, T2, T3, T4, T5, T6> Iterative6Inline<T1, T2, T3, T4, T5, T6> from(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6) {
            return this.of(this.wrap(t1), this.wrap(t2), this.wrap(t3), this.wrap(t4), this.wrap(t5), this.wrap(t6));
        }

        @Override
        public <T1, T2, T3, T4, T5, T6, T7> Iterative7Inline<T1, T2, T3, T4, T5, T6, T7> from(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7) {
            return this.of(this.wrap(t1), this.wrap(t2), this.wrap(t3), this.wrap(t4), this.wrap(t5), this.wrap(t6), this.wrap(t7));
        }

        @Override
        public <T1, T2, T3, T4, T5, T6, T7, T8> Iterative8Inline<T1, T2, T3, T4, T5, T6, T7, T8> from(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7, T8 t8) {
            return this.of(this.wrap(t1), this.wrap(t2), this.wrap(t3), this.wrap(t4), this.wrap(t5), this.wrap(t6), this.wrap(t7), this.wrap(t8));
        }

        @Override
        public <T1, T2> Iterative2Inline<T1, T2> of(Iterative1<? extends T1> iterative, Iterable<? extends T2> elem) {
            return Access.NULLABLE.equals(this.access) ? new Iterative2Inline.Iterative2InlineNullable<>(iterative, elem) : new Iterative2Inline.Iterative2InlineNonNullable<>(iterative, elem);
        }

        @Override
        public <T1, T2> Iterative2Inline<T1, T2> of(Iterable<? extends T1> t1, Iterable<? extends T2> t2) {
            return this.of(this.of(t1), t2);
        }

        @Override
        public <T1, T2, T3> Iterative3Inline<T1, T2, T3> of(Iterative2<? extends T1, ? extends T2> iterative, Iterable<? extends T3> elem) {
            return Access.NULLABLE.equals(this.access) ? new Iterative3Inline.Iterative3InlineNullable<>(iterative, elem) : new Iterative3Inline.Iterative3InlineNonNullable<>(iterative, elem);
        }

        @Override
        public <T1, T2, T3> Iterative3Inline<T1, T2, T3> of(Iterable<? extends T1> t1, Iterable<? extends T2> t2, Iterable<? extends T3> t3) {
            return this.of(this.of(t1, t2), t3);
        }

        @Override
        public <T1, T2, T3, T4> Iterative4Inline<T1, T2, T3, T4> of(Iterative3<? extends T1, ? extends T2, ? extends T3> iterative, Iterable<? extends T4> elem) {
            return Access.NULLABLE.equals(this.access) ? new Iterative4Inline.Iterative4InlineNullable<>(iterative, elem) : new Iterative4Inline.Iterative4InlineNonNullable<>(iterative, elem);
        }

        @Override
        public <T1, T2, T3, T4> Iterative4Inline<T1, T2, T3, T4> of(Iterable<? extends T1> t1, Iterable<? extends T2> t2, Iterable<? extends T3> t3, Iterable<? extends T4> t4) {
            return this.of(this.of(t1, t2, t3), t4);
        }

        @Override
        public <T1, T2, T3, T4, T5> Iterative5Inline<T1, T2, T3, T4, T5> of(Iterative4<? extends T1, ? extends T2, ? extends T3, ? extends T4> iterative, Iterable<? extends T5> elem) {
            return Access.NULLABLE.equals(this.access) ? new Iterative5Inline.Iterative5InlineNullable<>(iterative, elem) : new Iterative5Inline.Iterative5InlineNonNullable<>(iterative, elem);
        }

        @Override
        public <T1, T2, T3, T4, T5> Iterative5Inline<T1, T2, T3, T4, T5> of(Iterable<? extends T1> t1, Iterable<? extends T2> t2, Iterable<? extends T3> t3, Iterable<? extends T4> t4, Iterable<? extends T5> t5) {
            return this.of(this.of(t1, t2, t3, t4), t5);
        }

        @Override
        public <T1, T2, T3, T4, T5, T6> Iterative6Inline<T1, T2, T3, T4, T5, T6> of(Iterative5<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5> iterative, Iterable<? extends T6> elem) {
            return Access.NULLABLE.equals(this.access) ? new Iterative6Inline.Iterative6InlineNullable<>(iterative, elem) : new Iterative6Inline.Iterative6InlineNonNullable<>(iterative, elem);
        }

        @Override
        public <T1, T2, T3, T4, T5, T6> Iterative6Inline<T1, T2, T3, T4, T5, T6> of(Iterable<? extends T1> t1, Iterable<? extends T2> t2, Iterable<? extends T3> t3, Iterable<? extends T4> t4, Iterable<? extends T5> t5, Iterable<? extends T6> t6) {
            return this.of(this.of(t1, t2, t3, t4, t5), t6);
        }

        @Override
        public <T1, T2, T3, T4, T5, T6, T7> Iterative7Inline<T1, T2, T3, T4, T5, T6, T7> of(Iterable<? extends T1> t1, Iterable<? extends T2> t2, Iterable<? extends T3> t3, Iterable<? extends T4> t4, Iterable<? extends T5> t5, Iterable<? extends T6> t6, Iterable<? extends T7> t7) {
            return this.of(this.of(t1, t2, t3, t4, t5, t6), t7);
        }

        @Override
        public <T1, T2, T3, T4, T5, T6, T7> Iterative7Inline<T1, T2, T3, T4, T5, T6, T7> of(Iterative6<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6> iterative, Iterable<? extends T7> elem) {
            return Access.NULLABLE.equals(this.access) ? new Iterative7Inline.Iterative7InlineNullable<>(iterative, elem) : new Iterative7Inline.Iterative7InlineNonNullable<>(iterative, elem);
        }

        @Override
        public <T1, T2, T3, T4, T5, T6, T7, T8> Iterative8Inline<T1, T2, T3, T4, T5, T6, T7, T8> of(Iterable<? extends T1> t1, Iterable<? extends T2> t2, Iterable<? extends T3> t3, Iterable<? extends T4> t4, Iterable<? extends T5> t5, Iterable<? extends T6> t6, Iterable<? extends T7> t7, Iterable<? extends T8> t8) {
            return this.of(this.of(t1, t2, t3, t4, t5, t6, t7), t8);
        }

        @Override
        public <T1, T2, T3, T4, T5, T6, T7, T8> Iterative8Inline<T1, T2, T3, T4, T5, T6, T7, T8> of(Iterative7<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6, ? extends T7> iterative, Iterable<? extends T8> elem) {
            return Access.NULLABLE.equals(this.access) ? new Iterative8Inline.Iterative8InlineNullable<>(iterative, elem) : new Iterative8Inline.Iterative8InlineNonNullable<>(iterative, elem);
        }

        @Override
        public <T1, T2> Iterative2Inline<T1, T2> by(Iterable<? extends Stream<? extends T1>> t1, Iterable<? extends Stream<? extends T2>> t2) {
            return this.by(this.by(t1), t2);
        }

        @Override
        public <T1, T2> Iterative2Inline<T1, T2> by(Iterative1<? extends T1> iterative, Iterable<? extends Stream<? extends T2>> elem) {
            return Access.NULLABLE.equals(this.access) ? new Iterative2Inline.Iterative2InlineNullable<>(iterative, elem, true) : new Iterative2Inline.Iterative2InlineNonNullable<>(iterative, elem, true);
        }

        @Override
        public <T1, T2, T3> Iterative3Inline<T1, T2, T3> by(Iterable<? extends Stream<? extends T1>> t1, Iterable<? extends Stream<? extends T2>> t2, Iterable<? extends Stream<? extends T3>> t3) {
            return this.by(this.by(t1, t2), t3);
        }

        @Override
        public <T1, T2, T3> Iterative3Inline<T1, T2, T3> by(Iterative2<? extends T1, ? extends T2> iterative, Iterable<? extends Stream<? extends T3>> elem) {
            return Access.NULLABLE.equals(this.access) ? new Iterative3Inline.Iterative3InlineNullable<>(iterative, elem, true) : new Iterative3Inline.Iterative3InlineNonNullable<>(iterative, elem, true);
        }

        @Override
        public <T1, T2, T3, T4> Iterative4Inline<T1, T2, T3, T4> by(Iterable<? extends Stream<? extends T1>> t1, Iterable<? extends Stream<? extends T2>> t2, Iterable<? extends Stream<? extends T3>> t3, Iterable<? extends Stream<? extends T4>> t4) {
            return this.by(this.by(t1, t2, t3), t4);
        }

        @Override
        public <T1, T2, T3, T4> Iterative4Inline<T1, T2, T3, T4> by(Iterative3<? extends T1, ? extends T2, ? extends T3> iterative, Iterable<? extends Stream<? extends T4>> elem) {
            return Access.NULLABLE.equals(this.access) ? new Iterative4Inline.Iterative4InlineNullable<>(iterative, elem, true) : new Iterative4Inline.Iterative4InlineNonNullable<>(iterative, elem, true);
        }

        @Override
        public <T1, T2, T3, T4, T5> Iterative5Inline<T1, T2, T3, T4, T5> by(Iterable<? extends Stream<? extends T1>> t1, Iterable<? extends Stream<? extends T2>> t2, Iterable<? extends Stream<? extends T3>> t3, Iterable<? extends Stream<? extends T4>> t4, Iterable<? extends Stream<? extends T5>> t5) {
            return this.by(this.by(t1, t2, t3, t4), t5);
        }

        @Override
        public <T1, T2, T3, T4, T5> Iterative5Inline<T1, T2, T3, T4, T5> by(Iterative4<? extends T1, ? extends T2, ? extends T3, ? extends T4> iterative, Iterable<? extends Stream<? extends T5>> elem) {
            return Access.NULLABLE.equals(this.access) ? new Iterative5Inline.Iterative5InlineNullable<>(iterative, elem, true) : new Iterative5Inline.Iterative5InlineNonNullable<>(iterative, elem, true);
        }

        @Override
        public <T1, T2, T3, T4, T5, T6> Iterative6Inline<T1, T2, T3, T4, T5, T6> by(Iterable<? extends Stream<? extends T1>> t1, Iterable<? extends Stream<? extends T2>> t2, Iterable<? extends Stream<? extends T3>> t3, Iterable<? extends Stream<? extends T4>> t4, Iterable<? extends Stream<? extends T5>> t5, Iterable<? extends Stream<? extends T6>> t6) {
            return this.by(this.by(t1, t2, t3, t4, t5), t6);
        }

        @Override
        public <T1, T2, T3, T4, T5, T6> Iterative6Inline<T1, T2, T3, T4, T5, T6> by(Iterative5<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5> iterative, Iterable<? extends Stream<? extends T6>> elem) {
            return Access.NULLABLE.equals(this.access) ? new Iterative6Inline.Iterative6InlineNullable<>(iterative, elem, true) : new Iterative6Inline.Iterative6InlineNonNullable<>(iterative, elem, true);
        }

        @Override
        public <T1, T2, T3, T4, T5, T6, T7> Iterative7Inline<T1, T2, T3, T4, T5, T6, T7> by(Iterable<? extends Stream<? extends T1>> t1, Iterable<? extends Stream<? extends T2>> t2, Iterable<? extends Stream<? extends T3>> t3, Iterable<? extends Stream<? extends T4>> t4, Iterable<? extends Stream<? extends T5>> t5, Iterable<? extends Stream<? extends T6>> t6, Iterable<? extends Stream<? extends T7>> t7) {
            return this.by(this.by(t1, t2, t3, t4, t5, t6), t7);
        }

        @Override
        public <T1, T2, T3, T4, T5, T6, T7> Iterative7Inline<T1, T2, T3, T4, T5, T6, T7> by(Iterative6<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6> iterative, Iterable<? extends Stream<? extends T7>> elem) {
            return Access.NULLABLE.equals(this.access) ? new Iterative7Inline.Iterative7InlineNullable<>(iterative, elem, true) : new Iterative7Inline.Iterative7InlineNonNullable<>(iterative, elem, true);
        }

        @Override
        public <T1, T2, T3, T4, T5, T6, T7, T8> Iterative8Inline<T1, T2, T3, T4, T5, T6, T7, T8> by(Iterable<? extends Stream<? extends T1>> t1, Iterable<? extends Stream<? extends T2>> t2, Iterable<? extends Stream<? extends T3>> t3, Iterable<? extends Stream<? extends T4>> t4, Iterable<? extends Stream<? extends T5>> t5, Iterable<? extends Stream<? extends T6>> t6, Iterable<? extends Stream<? extends T7>> t7, Iterable<? extends Stream<? extends T8>> t8) {
            return this.by(this.by(t1, t2, t3, t4, t5, t6, t7), t8);
        }

        @Override
        public <T1, T2, T3, T4, T5, T6, T7, T8> Iterative8Inline<T1, T2, T3, T4, T5, T6, T7, T8> by(Iterative7<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6, ? extends T7> iterative, Iterable<? extends Stream<? extends T8>> elem) {
            return Access.NULLABLE.equals(this.access) ? new Iterative8Inline.Iterative8InlineNullable<>(iterative, elem, true) : new Iterative8Inline.Iterative8InlineNonNullable<>(iterative, elem, true);
        }

        @Override
        public <T1, T2> Iterative2Inline<T1, T2> empty2() {
            return this.of(Option.none(), Option.none());
        }

        @Override
        public <T1, T2, T3> Iterative3Inline<T1, T2, T3> empty3() {
            return this.of(Option.none(), Option.none(), Option.none());
        }

        @Override
        public <T1, T2, T3, T4> Iterative4Inline<T1, T2, T3, T4> empty4() {
            return this.of(Option.none(), Option.none(), Option.none(), Option.none());
        }

        @Override
        public <T1, T2, T3, T4, T5> Iterative5Inline<T1, T2, T3, T4, T5> empty5() {
            return this.of(Option.none(), Option.none(), Option.none(), Option.none(), Option.none());
        }

        @Override
        public <T1, T2, T3, T4, T5, T6> Iterative6Inline<T1, T2, T3, T4, T5, T6> empty6() {
            return this.of(Option.none(), Option.none(), Option.none(), Option.none(), Option.none(), Option.none());
        }

        @Override
        public <T1, T2, T3, T4, T5, T6, T7> Iterative7Inline<T1, T2, T3, T4, T5, T6, T7> empty7() {
            return this.of(Option.none(), Option.none(), Option.none(), Option.none(), Option.none(), Option.none(), Option.none());
        }

        @Override
        public <T1, T2, T3, T4, T5, T6, T7, T8> Iterative8Inline<T1, T2, T3, T4, T5, T6, T7, T8> empty8() {
            return this.of(Option.none(), Option.none(), Option.none(), Option.none(), Option.none(), Option.none(), Option.none(), Option.none());
        }

    }

    public static abstract class BuilderRegularCrossAbstract extends BuilderAbstract implements IterativeBuilderRegularCross {

        @Override
        public <T1, T2> Iterative2Cross<T1, T2> from(T1 t1, T2 t2) {
            return this.of(this.wrap(t1), this.wrap(t2));
        }

        @Override
        public <T1, T2, T3> Iterative3Cross<T1, T2, T3> from(T1 t1, T2 t2, T3 t3) {
            return this.of(this.wrap(t1), this.wrap(t2), this.wrap(t3));
        }

        @Override
        public <T1, T2, T3, T4> Iterative4Cross<T1, T2, T3, T4> from(T1 t1, T2 t2, T3 t3, T4 t4) {
            return this.of(this.wrap(t1), this.wrap(t2), this.wrap(t3), this.wrap(t4));
        }

        @Override
        public <T1, T2, T3, T4, T5> Iterative5Cross<T1, T2, T3, T4, T5> from(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5) {
            return this.of(this.wrap(t1), this.wrap(t2), this.wrap(t3), this.wrap(t4), this.wrap(t5));
        }

        @Override
        public <T1, T2, T3, T4, T5, T6> Iterative6Cross<T1, T2, T3, T4, T5, T6> from(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6) {
            return this.of(this.wrap(t1), this.wrap(t2), this.wrap(t3), this.wrap(t4), this.wrap(t5), this.wrap(t6));
        }

        @Override
        public <T1, T2, T3, T4, T5, T6, T7> Iterative7Cross<T1, T2, T3, T4, T5, T6, T7> from(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7) {
            return this.of(this.wrap(t1), this.wrap(t2), this.wrap(t3), this.wrap(t4), this.wrap(t5), this.wrap(t6), this.wrap(t7));
        }

        @Override
        public <T1, T2, T3, T4, T5, T6, T7, T8> Iterative8Cross<T1, T2, T3, T4, T5, T6, T7, T8> from(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7, T8 t8) {
            return this.of(this.wrap(t1), this.wrap(t2), this.wrap(t3), this.wrap(t4), this.wrap(t5), this.wrap(t6), this.wrap(t7), this.wrap(t8));
        }

        @Override
        public <T1, T2> Iterative2Cross<T1, T2> of(Iterative1<? extends T1> iterative, Iterable<? extends T2> elem) {
            return Access.NULLABLE.equals(this.access) ? new Iterative2Cross.Iterative2CrossNullable<>(iterative, elem) : new Iterative2Cross.Iterative2CrossNonNullable<>(iterative, elem);
        }

        @Override
        public <T1, T2> Iterative2Cross<T1, T2> of(Iterable<? extends T1> t1, Iterable<? extends T2> t2) {
            return this.of(this.of(t1), t2);
        }

        @Override
        public <T1, T2, T3> Iterative3Cross<T1, T2, T3> of(Iterative2<? extends T1, ? extends T2> iterative, Iterable<? extends T3> elem) {
            return Access.NULLABLE.equals(this.access) ? new Iterative3Cross.Iterative3CrossNullable<>(iterative, elem) : new Iterative3Cross.Iterative3CrossNonNullable<>(iterative, elem);
        }

        @Override
        public <T1, T2, T3> Iterative3Cross<T1, T2, T3> of(Iterable<? extends T1> t1, Iterable<? extends T2> t2, Iterable<? extends T3> t3) {
            return this.of(this.of(t1, t2), t3);
        }

        @Override
        public <T1, T2, T3, T4> Iterative4Cross<T1, T2, T3, T4> of(Iterative3<? extends T1, ? extends T2, ? extends T3> iterative, Iterable<? extends T4> elem) {
            return Access.NULLABLE.equals(this.access) ? new Iterative4Cross.Iterative4CrossNullable<>(iterative, elem) : new Iterative4Cross.Iterative4CrossNonNullable<>(iterative, elem);
        }

        @Override
        public <T1, T2, T3, T4> Iterative4Cross<T1, T2, T3, T4> of(Iterable<? extends T1> t1, Iterable<? extends T2> t2, Iterable<? extends T3> t3, Iterable<? extends T4> t4) {
            return this.of(this.of(t1, t2, t3), t4);
        }

        @Override
        public <T1, T2, T3, T4, T5> Iterative5Cross<T1, T2, T3, T4, T5> of(Iterative4<? extends T1, ? extends T2, ? extends T3, ? extends T4> iterative, Iterable<? extends T5> elem) {
            return Access.NULLABLE.equals(this.access) ? new Iterative5Cross.Iterative5CrossNullable<>(iterative, elem) : new Iterative5Cross.Iterative5CrossNonNullable<>(iterative, elem);
        }

        @Override
        public <T1, T2, T3, T4, T5> Iterative5Cross<T1, T2, T3, T4, T5> of(Iterable<? extends T1> t1, Iterable<? extends T2> t2, Iterable<? extends T3> t3, Iterable<? extends T4> t4, Iterable<? extends T5> t5) {
            return this.of(this.of(t1, t2, t3, t4), t5);
        }

        @Override
        public <T1, T2, T3, T4, T5, T6> Iterative6Cross<T1, T2, T3, T4, T5, T6> of(Iterative5<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5> iterative, Iterable<? extends T6> elem) {
            return Access.NULLABLE.equals(this.access) ? new Iterative6Cross.Iterative6CrossNullable<>(iterative, elem) : new Iterative6Cross.Iterative6CrossNonNullable<>(iterative, elem);
        }

        @Override
        public <T1, T2, T3, T4, T5, T6> Iterative6Cross<T1, T2, T3, T4, T5, T6> of(Iterable<? extends T1> t1, Iterable<? extends T2> t2, Iterable<? extends T3> t3, Iterable<? extends T4> t4, Iterable<? extends T5> t5, Iterable<? extends T6> t6) {
            return this.of(this.of(t1, t2, t3, t4, t5), t6);
        }

        @Override
        public <T1, T2, T3, T4, T5, T6, T7> Iterative7Cross<T1, T2, T3, T4, T5, T6, T7> of(Iterable<? extends T1> t1, Iterable<? extends T2> t2, Iterable<? extends T3> t3, Iterable<? extends T4> t4, Iterable<? extends T5> t5, Iterable<? extends T6> t6, Iterable<? extends T7> t7) {
            return this.of(this.of(t1, t2, t3, t4, t5, t6), t7);
        }

        @Override
        public <T1, T2, T3, T4, T5, T6, T7> Iterative7Cross<T1, T2, T3, T4, T5, T6, T7> of(Iterative6<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6> iterative, Iterable<? extends T7> elem) {
            return Access.NULLABLE.equals(this.access) ? new Iterative7Cross.Iterative7CrossNullable<>(iterative, elem) : new Iterative7Cross.Iterative7CrossNonNullable<>(iterative, elem);
        }

        @Override
        public <T1, T2, T3, T4, T5, T6, T7, T8> Iterative8Cross<T1, T2, T3, T4, T5, T6, T7, T8> of(Iterable<? extends T1> t1, Iterable<? extends T2> t2, Iterable<? extends T3> t3, Iterable<? extends T4> t4, Iterable<? extends T5> t5, Iterable<? extends T6> t6, Iterable<? extends T7> t7, Iterable<? extends T8> t8) {
            return this.of(this.of(t1, t2, t3, t4, t5, t6, t7), t8);
        }

        @Override
        public <T1, T2, T3, T4, T5, T6, T7, T8> Iterative8Cross<T1, T2, T3, T4, T5, T6, T7, T8> of(Iterative7<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6, ? extends T7> iterative, Iterable<? extends T8> elem) {
            return Access.NULLABLE.equals(this.access) ? new Iterative8Cross.Iterative8CrossNullable<>(iterative, elem) : new Iterative8Cross.Iterative8CrossNonNullable<>(iterative, elem);
        }

        @Override
        public <T1, T2> Iterative2Cross<T1, T2> by(Iterable<? extends Stream<? extends T1>> t1, Iterable<? extends Stream<? extends T2>> t2) {
            return this.by(this.by(t1), t2);
        }

        @Override
        public <T1, T2> Iterative2Cross<T1, T2> by(Iterative1<? extends T1> iterative, Iterable<? extends Stream<? extends T2>> elem) {
            return Access.NULLABLE.equals(this.access) ? new Iterative2Cross.Iterative2CrossNullable<>(iterative, elem, true) : new Iterative2Cross.Iterative2CrossNonNullable<>(iterative, elem, true);
        }

        @Override
        public <T1, T2, T3> Iterative3Cross<T1, T2, T3> by(Iterable<? extends Stream<? extends T1>> t1, Iterable<? extends Stream<? extends T2>> t2, Iterable<? extends Stream<? extends T3>> t3) {
            return this.by(this.by(t1, t2), t3);
        }

        @Override
        public <T1, T2, T3> Iterative3Cross<T1, T2, T3> by(Iterative2<? extends T1, ? extends T2> iterative, Iterable<? extends Stream<? extends T3>> elem) {
            return Access.NULLABLE.equals(this.access) ? new Iterative3Cross.Iterative3CrossNullable<>(iterative, elem, true) : new Iterative3Cross.Iterative3CrossNonNullable<>(iterative, elem, true);
        }

        @Override
        public <T1, T2, T3, T4> Iterative4Cross<T1, T2, T3, T4> by(Iterable<? extends Stream<? extends T1>> t1, Iterable<? extends Stream<? extends T2>> t2, Iterable<? extends Stream<? extends T3>> t3, Iterable<? extends Stream<? extends T4>> t4) {
            return this.by(this.by(t1, t2, t3), t4);
        }

        @Override
        public <T1, T2, T3, T4> Iterative4Cross<T1, T2, T3, T4> by(Iterative3<? extends T1, ? extends T2, ? extends T3> iterative, Iterable<? extends Stream<? extends T4>> elem) {
            return Access.NULLABLE.equals(this.access) ? new Iterative4Cross.Iterative4CrossNullable<>(iterative, elem, true) : new Iterative4Cross.Iterative4CrossNonNullable<>(iterative, elem, true);
        }

        @Override
        public <T1, T2, T3, T4, T5> Iterative5Cross<T1, T2, T3, T4, T5> by(Iterable<? extends Stream<? extends T1>> t1, Iterable<? extends Stream<? extends T2>> t2, Iterable<? extends Stream<? extends T3>> t3, Iterable<? extends Stream<? extends T4>> t4, Iterable<? extends Stream<? extends T5>> t5) {
            return this.by(this.by(t1, t2, t3, t4), t5);
        }

        @Override
        public <T1, T2, T3, T4, T5> Iterative5Cross<T1, T2, T3, T4, T5> by(Iterative4<? extends T1, ? extends T2, ? extends T3, ? extends T4> iterative, Iterable<? extends Stream<? extends T5>> elem) {
            return Access.NULLABLE.equals(this.access) ? new Iterative5Cross.Iterative5CrossNullable<>(iterative, elem, true) : new Iterative5Cross.Iterative5CrossNonNullable<>(iterative, elem, true);
        }

        @Override
        public <T1, T2, T3, T4, T5, T6> Iterative6Cross<T1, T2, T3, T4, T5, T6> by(Iterable<? extends Stream<? extends T1>> t1, Iterable<? extends Stream<? extends T2>> t2, Iterable<? extends Stream<? extends T3>> t3, Iterable<? extends Stream<? extends T4>> t4, Iterable<? extends Stream<? extends T5>> t5, Iterable<? extends Stream<? extends T6>> t6) {
            return this.by(this.by(t1, t2, t3, t4, t5), t6);
        }

        @Override
        public <T1, T2, T3, T4, T5, T6> Iterative6Cross<T1, T2, T3, T4, T5, T6> by(Iterative5<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5> iterative, Iterable<? extends Stream<? extends T6>> elem) {
            return Access.NULLABLE.equals(this.access) ? new Iterative6Cross.Iterative6CrossNullable<>(iterative, elem, true) : new Iterative6Cross.Iterative6CrossNonNullable<>(iterative, elem, true);
        }

        @Override
        public <T1, T2, T3, T4, T5, T6, T7> Iterative7Cross<T1, T2, T3, T4, T5, T6, T7> by(Iterable<? extends Stream<? extends T1>> t1, Iterable<? extends Stream<? extends T2>> t2, Iterable<? extends Stream<? extends T3>> t3, Iterable<? extends Stream<? extends T4>> t4, Iterable<? extends Stream<? extends T5>> t5, Iterable<? extends Stream<? extends T6>> t6, Iterable<? extends Stream<? extends T7>> t7) {
            return this.by(this.by(t1, t2, t3, t4, t5, t6), t7);
        }

        @Override
        public <T1, T2, T3, T4, T5, T6, T7> Iterative7Cross<T1, T2, T3, T4, T5, T6, T7> by(Iterative6<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6> iterative, Iterable<? extends Stream<? extends T7>> elem) {
            return Access.NULLABLE.equals(this.access) ? new Iterative7Cross.Iterative7CrossNullable<>(iterative, elem, true) : new Iterative7Cross.Iterative7CrossNonNullable<>(iterative, elem, true);
        }

        @Override
        public <T1, T2, T3, T4, T5, T6, T7, T8> Iterative8Cross<T1, T2, T3, T4, T5, T6, T7, T8> by(Iterable<? extends Stream<? extends T1>> t1, Iterable<? extends Stream<? extends T2>> t2, Iterable<? extends Stream<? extends T3>> t3, Iterable<? extends Stream<? extends T4>> t4, Iterable<? extends Stream<? extends T5>> t5, Iterable<? extends Stream<? extends T6>> t6, Iterable<? extends Stream<? extends T7>> t7, Iterable<? extends Stream<? extends T8>> t8) {
            return this.by(this.by(t1, t2, t3, t4, t5, t6, t7), t8);
        }

        @Override
        public <T1, T2, T3, T4, T5, T6, T7, T8> Iterative8Cross<T1, T2, T3, T4, T5, T6, T7, T8> by(Iterative7<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6, ? extends T7> iterative, Iterable<? extends Stream<? extends T8>> elem) {
            return Access.NULLABLE.equals(this.access) ? new Iterative8Cross.Iterative8CrossNullable<>(iterative, elem, true) : new Iterative8Cross.Iterative8CrossNonNullable<>(iterative, elem, true);
        }

        @Override
        public <T1, T2> Iterative2Cross<T1, T2> empty2() {
            return this.of(Option.none(), Option.none());
        }

        @Override
        public <T1, T2, T3> Iterative3Cross<T1, T2, T3> empty3() {
            return this.of(Option.none(), Option.none(), Option.none());
        }

        @Override
        public <T1, T2, T3, T4> Iterative4Cross<T1, T2, T3, T4> empty4() {
            return this.of(Option.none(), Option.none(), Option.none(), Option.none());
        }

        @Override
        public <T1, T2, T3, T4, T5> Iterative5Cross<T1, T2, T3, T4, T5> empty5() {
            return this.of(Option.none(), Option.none(), Option.none(), Option.none(), Option.none());
        }

        @Override
        public <T1, T2, T3, T4, T5, T6> Iterative6Cross<T1, T2, T3, T4, T5, T6> empty6() {
            return this.of(Option.none(), Option.none(), Option.none(), Option.none(), Option.none(), Option.none());
        }

        @Override
        public <T1, T2, T3, T4, T5, T6, T7> Iterative7Cross<T1, T2, T3, T4, T5, T6, T7> empty7() {
            return this.of(Option.none(), Option.none(), Option.none(), Option.none(), Option.none(), Option.none(), Option.none());
        }

        @Override
        public <T1, T2, T3, T4, T5, T6, T7, T8> Iterative8Cross<T1, T2, T3, T4, T5, T6, T7, T8> empty8() {
            return this.of(Option.none(), Option.none(), Option.none(), Option.none(), Option.none(), Option.none(), Option.none(), Option.none());
        }

    }

    public static abstract class BuilderAbstract extends BuilderImpl implements IterativeBuilderRegular {

        @Override
        public <T1> Iterative1<T1> from(T1 t1) {
            return this.of(this.wrap(t1));
        }

        @Override
        public Iterative0 of() {
            return Access.NULLABLE.equals(this.access) ? new Iterative0.Iterative0Nullable() : new Iterative0.Iterative0NonNullable();
        }

        @Override
        public <T1> Iterative1<T1> of(Iterable<? extends T1> t1) {
            return Access.NULLABLE.equals(this.access) ? new Iterative1.Iterative1Nullable<>(t1) : new Iterative1.Iterative1NonNullable<>(t1);
        }

        @Override
        public <T1> Iterative1<T1> by(Iterable<? extends Stream<? extends T1>> t1) {
            return Access.NULLABLE.equals(this.access) ? new Iterative1.Iterative1Nullable<>(t1, true) : new Iterative1.Iterative1NonNullable<>(t1, true);
        }

        @Override
        public Iterative0 empty0() {
            return this.of();
        }

        @Override
        public <T1> Iterative1<T1> empty1() {
            return this.of(Option.none());
        }

    }

    public static abstract class BuilderImpl {

        Iterate iterate = Iterate.CROSS;
        Access access = Access.NON_NULLABLE;
        Argument argument = Argument.REGULAR;

        BuilderImpl() {
        }

        protected <F> Option<F> wrap(F f) {
            return Access.NULLABLE.equals(this.access) ? Iterative.wrapNullable(f) : Iterative.wrapNonNullable(f);
        }

    }

    public static interface RegularBuilder extends IterativeBuilderIteArgReg, IterativeBuilderIteAccReg {

        @Override
        public IterativeBuilderArgAccRegCro cross();

        @Override
        public IterativeBuilderArgAccRegInl inline();

        @Override
        public IterativeBuilderIteArgReg nullable();

        @Override
        public IterativeBuilderIteArgReg nonNullable();

        @Override
        public IterativeBuilderIteAccReg regularArgs();

        @Override
        public IterativeBuilderIteAccTup tupleArgs();
    }

    public static interface IterativeBuilderIteAccTup extends IterativeBuilderAccTup, IterativeBuilderIteTup, IterativeBuilderTuple {

        @Override
        public IterativeBuilderIteTup nullable();

        @Override
        public IterativeBuilderIteTup nonNullable();

        @Override
        public IterativeBuilderAccTupCro cross();

        @Override
        public IterativeBuilderAccTupInl inline();
    }

    public static interface IterativeBuilderIteAccReg extends IterativeBuilderAccReg, IterativeBuilderIteReg, IterativeBuilderRegular {

        @Override
        public IterativeBuilderIteReg nullable();

        @Override
        public IterativeBuilderIteReg nonNullable();

        @Override
        public IterativeBuilderAccRegCro cross();

        @Override
        public IterativeBuilderAccRegInl inline();
    }

    public static interface IterativeBuilderArgAccRegInl extends IterativeBuilderAccRegInl, IterativeBuilderArgRegInl, IterativeBuilderRegularInline {

        @Override
        public IterativeBuilderArgRegInl nullable();

        @Override
        public IterativeBuilderArgRegInl nonNullable();

        @Override
        public IterativeBuilderAccRegInl regularArgs();

        @Override
        public IterativeBuilderAccTupInl tupleArgs();
    }

    public static interface IterativeBuilderArgAccRegCro extends IterativeBuilderAccRegCro, IterativeBuilderArgRegCro, IterativeBuilderRegularCross {

        @Override
        public IterativeBuilderArgRegCro nullable();

        @Override
        public IterativeBuilderArgRegCro nonNullable();

        @Override
        public IterativeBuilderAccRegCro regularArgs();

        @Override
        public IterativeBuilderAccTupCro tupleArgs();
    }

    public static interface IterativeBuilderIteArgReg extends IterativeBuilderIteReg, IterativeBuilderArgument, IterativeBuilderRegular {

        @Override
        public IterativeBuilderArgRegCro cross();

        @Override
        public IterativeBuilderArgRegInl inline();

        @Override
        public IterativeBuilderIteReg regularArgs();

        @Override
        public IterativeBuilderIteTup tupleArgs();
    }

    public static interface IterativeBuilderArgRegInl extends IterativeBuilderArgument, IterativeBuilderRegularInline {

        @Override
        public IterativeBuilderRegularInline regularArgs();

        @Override
        public IterativeBuilderTupleInline tupleArgs();
    }

    public static interface IterativeBuilderArgRegCro extends IterativeBuilderArgument, IterativeBuilderRegularCross {

        @Override
        public IterativeBuilderRegularCross regularArgs();

        @Override
        public IterativeBuilderTupleCross tupleArgs();
    }

    public static interface IterativeBuilderAccTupInl extends IterativeBuilderAccess, IterativeBuilderTupleInline {

        @Override
        public IterativeBuilderTupleInline nullable();

        @Override
        public IterativeBuilderTupleInline nonNullable();
    }

    public static interface IterativeBuilderAccTupCro extends IterativeBuilderAccess, IterativeBuilderTupleCross {

        @Override
        public IterativeBuilderTupleCross nullable();

        @Override
        public IterativeBuilderTupleCross nonNullable();
    }

    public static interface IterativeBuilderAccRegInl extends IterativeBuilderAccess, IterativeBuilderRegularInline {

        @Override
        public IterativeBuilderRegularInline nullable();

        @Override
        public IterativeBuilderRegularInline nonNullable();
    }

    public static interface IterativeBuilderAccRegCro extends IterativeBuilderAccess, IterativeBuilderRegularCross {

        @Override
        public IterativeBuilderRegularCross nullable();

        @Override
        public IterativeBuilderRegularCross nonNullable();
    }

    public static interface IterativeBuilderAccTup extends IterativeBuilderAccess, IterativeBuilderTuple {

        @Override
        public IterativeBuilderTuple nullable();

        @Override
        public IterativeBuilderTuple nonNullable();
    }

    public static interface IterativeBuilderAccReg extends IterativeBuilderAccess, IterativeBuilderRegular {

        @Override
        public IterativeBuilderRegular nullable();

        @Override
        public IterativeBuilderRegular nonNullable();
    }

    public static interface IterativeBuilderIteTup extends IterativeBuilderIterate, IterativeBuilderTuple {

        @Override
        public IterativeBuilderTupleCross cross();

        @Override
        public IterativeBuilderTupleInline inline();
    }

    public static interface IterativeBuilderIteReg extends IterativeBuilderIterate, IterativeBuilderRegular {

        @Override
        public IterativeBuilderRegularCross cross();

        @Override
        public IterativeBuilderRegularInline inline();
    }

    public static interface IterativeBuilderRegularInline extends IterativeBuilderRegular {

        public <T1, T2> Iterative2Inline<T1, T2> from(T1 t1, T2 t2);

        public <T1, T2, T3> Iterative3Inline<T1, T2, T3> from(T1 t1, T2 t2, T3 t3);

        public <T1, T2, T3, T4> Iterative4Inline<T1, T2, T3, T4> from(T1 t1, T2 t2, T3 t3, T4 t4);

        public <T1, T2, T3, T4, T5> Iterative5Inline<T1, T2, T3, T4, T5> from(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5);

        public <T1, T2, T3, T4, T5, T6> Iterative6Inline<T1, T2, T3, T4, T5, T6> from(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6);

        public <T1, T2, T3, T4, T5, T6, T7> Iterative7Inline<T1, T2, T3, T4, T5, T6, T7> from(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7);

        public <T1, T2, T3, T4, T5, T6, T7, T8> Iterative8Inline<T1, T2, T3, T4, T5, T6, T7, T8> from(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7, T8 t8);

        public <T1, T2> Iterative2Inline<T1, T2> of(Iterable<? extends T1> i1, Iterable<? extends T2> i2);

        public <T1, T2> Iterative2Inline<T1, T2> of(Iterative1<? extends T1> i1, Iterable<? extends T2> i2);

        public <T1, T2, T3> Iterative3Inline<T1, T2, T3> of(Iterable<? extends T1> i1, Iterable<? extends T2> i2, Iterable<? extends T3> i3);

        public <T1, T2, T3> Iterative3Inline<T1, T2, T3> of(Iterative2<? extends T1, ? extends T2> i1, Iterable<? extends T3> i2);

        public <T1, T2, T3, T4> Iterative4Inline<T1, T2, T3, T4> of(Iterable<? extends T1> i1, Iterable<? extends T2> i2, Iterable<? extends T3> i3, Iterable<? extends T4> i4);

        public <T1, T2, T3, T4> Iterative4Inline<T1, T2, T3, T4> of(Iterative3<? extends T1, ? extends T2, ? extends T3> i1, Iterable<? extends T4> i2);

        public <T1, T2, T3, T4, T5> Iterative5Inline<T1, T2, T3, T4, T5> of(Iterable<? extends T1> i1, Iterable<? extends T2> i2, Iterable<? extends T3> i3, Iterable<? extends T4> i4, Iterable<? extends T5> i5);

        public <T1, T2, T3, T4, T5> Iterative5Inline<T1, T2, T3, T4, T5> of(Iterative4<? extends T1, ? extends T2, ? extends T3, ? extends T4> i1, Iterable<? extends T5> i2);

        public <T1, T2, T3, T4, T5, T6> Iterative6Inline<T1, T2, T3, T4, T5, T6> of(Iterable<? extends T1> i1, Iterable<? extends T2> i2, Iterable<? extends T3> i3, Iterable<? extends T4> i4, Iterable<? extends T5> i5, Iterable<? extends T6> i6);

        public <T1, T2, T3, T4, T5, T6> Iterative6Inline<T1, T2, T3, T4, T5, T6> of(Iterative5<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5> i1, Iterable<? extends T6> i2);

        public <T1, T2, T3, T4, T5, T6, T7> Iterative7Inline<T1, T2, T3, T4, T5, T6, T7> of(Iterable<? extends T1> i1, Iterable<? extends T2> i2, Iterable<? extends T3> i3, Iterable<? extends T4> i4, Iterable<? extends T5> i5, Iterable<? extends T6> i6, Iterable<? extends T7> i7);

        public <T1, T2, T3, T4, T5, T6, T7> Iterative7Inline<T1, T2, T3, T4, T5, T6, T7> of(Iterative6<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6> i1, Iterable<? extends T7> i2);

        public <T1, T2, T3, T4, T5, T6, T7, T8> Iterative8Inline<T1, T2, T3, T4, T5, T6, T7, T8> of(Iterable<? extends T1> i1, Iterable<? extends T2> i2, Iterable<? extends T3> i3, Iterable<? extends T4> i4, Iterable<? extends T5> i5, Iterable<? extends T6> i6, Iterable<? extends T7> i7, Iterable<? extends T8> i8);

        public <T1, T2, T3, T4, T5, T6, T7, T8> Iterative8Inline<T1, T2, T3, T4, T5, T6, T7, T8> of(Iterative7<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6, ? extends T7> i1, Iterable<? extends T8> i2);

        public <T1, T2> Iterative2Inline<T1, T2> by(Iterable<? extends Stream<? extends T1>> i1, Iterable<? extends Stream<? extends T2>> i2);

        public <T1, T2, T3> Iterative3Inline<T1, T2, T3> by(Iterable<? extends Stream<? extends T1>> i1, Iterable<? extends Stream<? extends T2>> i2, Iterable<? extends Stream<? extends T3>> i3);

        public <T1, T2> Iterative2Inline<T1, T2> by(Iterative1<? extends T1> i1, Iterable<? extends Stream<? extends T2>> i2);

        public <T1, T2, T3> Iterative3Inline<T1, T2, T3> by(Iterative2<? extends T1, ? extends T2> i1, Iterable<? extends Stream<? extends T3>> i2);

        public <T1, T2, T3, T4> Iterative4Inline<T1, T2, T3, T4> by(Iterable<? extends Stream<? extends T1>> i1, Iterable<? extends Stream<? extends T2>> i2, Iterable<? extends Stream<? extends T3>> i3, Iterable<? extends Stream<? extends T4>> i4);

        public <T1, T2, T3, T4> Iterative4Inline<T1, T2, T3, T4> by(Iterative3<? extends T1, ? extends T2, ? extends T3> i1, Iterable<? extends Stream<? extends T4>> i2);

        public <T1, T2, T3, T4, T5> Iterative5Inline<T1, T2, T3, T4, T5> by(Iterable<? extends Stream<? extends T1>> i1, Iterable<? extends Stream<? extends T2>> i2, Iterable<? extends Stream<? extends T3>> i3, Iterable<? extends Stream<? extends T4>> i4, Iterable<? extends Stream<? extends T5>> i5);

        public <T1, T2, T3, T4, T5> Iterative5Inline<T1, T2, T3, T4, T5> by(Iterative4<? extends T1, ? extends T2, ? extends T3, ? extends T4> i1, Iterable<? extends Stream<? extends T5>> i2);

        public <T1, T2, T3, T4, T5, T6> Iterative6Inline<T1, T2, T3, T4, T5, T6> by(Iterable<? extends Stream<? extends T1>> i1, Iterable<? extends Stream<? extends T2>> i2, Iterable<? extends Stream<? extends T3>> i3, Iterable<? extends Stream<? extends T4>> i4, Iterable<? extends Stream<? extends T5>> i5, Iterable<? extends Stream<? extends T6>> i6);

        public <T1, T2, T3, T4, T5, T6> Iterative6Inline<T1, T2, T3, T4, T5, T6> by(Iterative5<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5> i1, Iterable<? extends Stream<? extends T6>> i2);

        public <T1, T2, T3, T4, T5, T6, T7> Iterative7Inline<T1, T2, T3, T4, T5, T6, T7> by(Iterable<? extends Stream<? extends T1>> i1, Iterable<? extends Stream<? extends T2>> i2, Iterable<? extends Stream<? extends T3>> i3, Iterable<? extends Stream<? extends T4>> i4, Iterable<? extends Stream<? extends T5>> i5, Iterable<? extends Stream<? extends T6>> i6, Iterable<? extends Stream<? extends T7>> i7);

        public <T1, T2, T3, T4, T5, T6, T7> Iterative7Inline<T1, T2, T3, T4, T5, T6, T7> by(Iterative6<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6> i1, Iterable<? extends Stream<? extends T7>> i2);

        public <T1, T2, T3, T4, T5, T6, T7, T8> Iterative8Inline<T1, T2, T3, T4, T5, T6, T7, T8> by(Iterable<? extends Stream<? extends T1>> i1, Iterable<? extends Stream<? extends T2>> i2, Iterable<? extends Stream<? extends T3>> i3, Iterable<? extends Stream<? extends T4>> i4, Iterable<? extends Stream<? extends T5>> i5, Iterable<? extends Stream<? extends T6>> i6, Iterable<? extends Stream<? extends T7>> i7, Iterable<? extends Stream<? extends T8>> i8);

        public <T1, T2, T3, T4, T5, T6, T7, T8> Iterative8Inline<T1, T2, T3, T4, T5, T6, T7, T8> by(Iterative7<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6, ? extends T7> i1, Iterable<? extends Stream<? extends T8>> i2);

        public <T1, T2> Iterative2Inline<T1, T2> empty2();

        public <T1, T2, T3> Iterative3Inline<T1, T2, T3> empty3();

        public <T1, T2, T3, T4> Iterative4Inline<T1, T2, T3, T4> empty4();

        public <T1, T2, T3, T4, T5> Iterative5Inline<T1, T2, T3, T4, T5> empty5();

        public <T1, T2, T3, T4, T5, T6> Iterative6Inline<T1, T2, T3, T4, T5, T6> empty6();

        public <T1, T2, T3, T4, T5, T6, T7> Iterative7Inline<T1, T2, T3, T4, T5, T6, T7> empty7();

        public <T1, T2, T3, T4, T5, T6, T7, T8> Iterative8Inline<T1, T2, T3, T4, T5, T6, T7, T8> empty8();
    }

    public static interface IterativeBuilderRegularCross extends IterativeBuilderRegular {

        public <T1, T2> Iterative2Cross<T1, T2> from(T1 t1, T2 t2);

        public <T1, T2, T3> Iterative3Cross<T1, T2, T3> from(T1 t1, T2 t2, T3 t3);

        public <T1, T2, T3, T4> Iterative4Cross<T1, T2, T3, T4> from(T1 t1, T2 t2, T3 t3, T4 t4);

        public <T1, T2, T3, T4, T5> Iterative5Cross<T1, T2, T3, T4, T5> from(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5);

        public <T1, T2, T3, T4, T5, T6> Iterative6Cross<T1, T2, T3, T4, T5, T6> from(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6);

        public <T1, T2, T3, T4, T5, T6, T7> Iterative7Cross<T1, T2, T3, T4, T5, T6, T7> from(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7);

        public <T1, T2, T3, T4, T5, T6, T7, T8> Iterative8Cross<T1, T2, T3, T4, T5, T6, T7, T8> from(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7, T8 t8);

        public <T1, T2> Iterative2Cross<T1, T2> of(Iterable<? extends T1> i1, Iterable<? extends T2> i2);

        public <T1, T2> Iterative2Cross<T1, T2> of(Iterative1<? extends T1> i1, Iterable<? extends T2> i2);

        public <T1, T2, T3> Iterative3Cross<T1, T2, T3> of(Iterable<? extends T1> i1, Iterable<? extends T2> i2, Iterable<? extends T3> i3);

        public <T1, T2, T3> Iterative3Cross<T1, T2, T3> of(Iterative2<? extends T1, ? extends T2> i1, Iterable<? extends T3> i2);

        public <T1, T2, T3, T4> Iterative4Cross<T1, T2, T3, T4> of(Iterable<? extends T1> i1, Iterable<? extends T2> i2, Iterable<? extends T3> i3, Iterable<? extends T4> i4);

        public <T1, T2, T3, T4> Iterative4Cross<T1, T2, T3, T4> of(Iterative3<? extends T1, ? extends T2, ? extends T3> i1, Iterable<? extends T4> i2);

        public <T1, T2, T3, T4, T5> Iterative5Cross<T1, T2, T3, T4, T5> of(Iterable<? extends T1> i1, Iterable<? extends T2> i2, Iterable<? extends T3> i3, Iterable<? extends T4> i4, Iterable<? extends T5> i5);

        public <T1, T2, T3, T4, T5> Iterative5Cross<T1, T2, T3, T4, T5> of(Iterative4<? extends T1, ? extends T2, ? extends T3, ? extends T4> i1, Iterable<? extends T5> i2);

        public <T1, T2, T3, T4, T5, T6> Iterative6Cross<T1, T2, T3, T4, T5, T6> of(Iterable<? extends T1> i1, Iterable<? extends T2> i2, Iterable<? extends T3> i3, Iterable<? extends T4> i4, Iterable<? extends T5> i5, Iterable<? extends T6> i6);

        public <T1, T2, T3, T4, T5, T6> Iterative6Cross<T1, T2, T3, T4, T5, T6> of(Iterative5<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5> i1, Iterable<? extends T6> i2);

        public <T1, T2, T3, T4, T5, T6, T7> Iterative7Cross<T1, T2, T3, T4, T5, T6, T7> of(Iterable<? extends T1> i1, Iterable<? extends T2> i2, Iterable<? extends T3> i3, Iterable<? extends T4> i4, Iterable<? extends T5> i5, Iterable<? extends T6> i6, Iterable<? extends T7> i7);

        public <T1, T2, T3, T4, T5, T6, T7> Iterative7Cross<T1, T2, T3, T4, T5, T6, T7> of(Iterative6<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6> i1, Iterable<? extends T7> i2);

        public <T1, T2, T3, T4, T5, T6, T7, T8> Iterative8Cross<T1, T2, T3, T4, T5, T6, T7, T8> of(Iterable<? extends T1> i1, Iterable<? extends T2> i2, Iterable<? extends T3> i3, Iterable<? extends T4> i4, Iterable<? extends T5> i5, Iterable<? extends T6> i6, Iterable<? extends T7> i7, Iterable<? extends T8> i8);

        public <T1, T2, T3, T4, T5, T6, T7, T8> Iterative8Cross<T1, T2, T3, T4, T5, T6, T7, T8> of(Iterative7<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6, ? extends T7> i1, Iterable<? extends T8> i2);

        public <T1, T2> Iterative2Cross<T1, T2> by(Iterable<? extends Stream<? extends T1>> i1, Iterable<? extends Stream<? extends T2>> i2);

        public <T1, T2, T3> Iterative3Cross<T1, T2, T3> by(Iterable<? extends Stream<? extends T1>> i1, Iterable<? extends Stream<? extends T2>> i2, Iterable<? extends Stream<? extends T3>> i3);

        public <T1, T2> Iterative2Cross<T1, T2> by(Iterative1<? extends T1> i1, Iterable<? extends Stream<? extends T2>> i2);

        public <T1, T2, T3> Iterative3Cross<T1, T2, T3> by(Iterative2<? extends T1, ? extends T2> i1, Iterable<? extends Stream<? extends T3>> i2);

        public <T1, T2, T3, T4> Iterative4Cross<T1, T2, T3, T4> by(Iterable<? extends Stream<? extends T1>> i1, Iterable<? extends Stream<? extends T2>> i2, Iterable<? extends Stream<? extends T3>> i3, Iterable<? extends Stream<? extends T4>> i4);

        public <T1, T2, T3, T4> Iterative4Cross<T1, T2, T3, T4> by(Iterative3<? extends T1, ? extends T2, ? extends T3> i1, Iterable<? extends Stream<? extends T4>> i2);

        public <T1, T2, T3, T4, T5> Iterative5Cross<T1, T2, T3, T4, T5> by(Iterable<? extends Stream<? extends T1>> i1, Iterable<? extends Stream<? extends T2>> i2, Iterable<? extends Stream<? extends T3>> i3, Iterable<? extends Stream<? extends T4>> i4, Iterable<? extends Stream<? extends T5>> i5);

        public <T1, T2, T3, T4, T5> Iterative5Cross<T1, T2, T3, T4, T5> by(Iterative4<? extends T1, ? extends T2, ? extends T3, ? extends T4> i1, Iterable<? extends Stream<? extends T5>> i2);

        public <T1, T2, T3, T4, T5, T6> Iterative6Cross<T1, T2, T3, T4, T5, T6> by(Iterable<? extends Stream<? extends T1>> i1, Iterable<? extends Stream<? extends T2>> i2, Iterable<? extends Stream<? extends T3>> i3, Iterable<? extends Stream<? extends T4>> i4, Iterable<? extends Stream<? extends T5>> i5, Iterable<? extends Stream<? extends T6>> i6);

        public <T1, T2, T3, T4, T5, T6> Iterative6Cross<T1, T2, T3, T4, T5, T6> by(Iterative5<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5> i1, Iterable<? extends Stream<? extends T6>> i2);

        public <T1, T2, T3, T4, T5, T6, T7> Iterative7Cross<T1, T2, T3, T4, T5, T6, T7> by(Iterable<? extends Stream<? extends T1>> i1, Iterable<? extends Stream<? extends T2>> i2, Iterable<? extends Stream<? extends T3>> i3, Iterable<? extends Stream<? extends T4>> i4, Iterable<? extends Stream<? extends T5>> i5, Iterable<? extends Stream<? extends T6>> i6, Iterable<? extends Stream<? extends T7>> i7);

        public <T1, T2, T3, T4, T5, T6, T7> Iterative7Cross<T1, T2, T3, T4, T5, T6, T7> by(Iterative6<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6> i1, Iterable<? extends Stream<? extends T7>> i2);

        public <T1, T2, T3, T4, T5, T6, T7, T8> Iterative8Cross<T1, T2, T3, T4, T5, T6, T7, T8> by(Iterable<? extends Stream<? extends T1>> i1, Iterable<? extends Stream<? extends T2>> i2, Iterable<? extends Stream<? extends T3>> i3, Iterable<? extends Stream<? extends T4>> i4, Iterable<? extends Stream<? extends T5>> i5, Iterable<? extends Stream<? extends T6>> i6, Iterable<? extends Stream<? extends T7>> i7, Iterable<? extends Stream<? extends T8>> i8);

        public <T1, T2, T3, T4, T5, T6, T7, T8> Iterative8Cross<T1, T2, T3, T4, T5, T6, T7, T8> by(Iterative7<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6, ? extends T7> i1, Iterable<? extends Stream<? extends T8>> i2);

        public <T1, T2> Iterative2Cross<T1, T2> empty2();

        public <T1, T2, T3> Iterative3Cross<T1, T2, T3> empty3();

        public <T1, T2, T3, T4> Iterative4Cross<T1, T2, T3, T4> empty4();

        public <T1, T2, T3, T4, T5> Iterative5Cross<T1, T2, T3, T4, T5> empty5();

        public <T1, T2, T3, T4, T5, T6> Iterative6Cross<T1, T2, T3, T4, T5, T6> empty6();

        public <T1, T2, T3, T4, T5, T6, T7> Iterative7Cross<T1, T2, T3, T4, T5, T6, T7> empty7();

        public <T1, T2, T3, T4, T5, T6, T7, T8> Iterative8Cross<T1, T2, T3, T4, T5, T6, T7, T8> empty8();
    }

    public static interface IterativeBuilderRegular extends IterativeBuilder {

        public <T1> Iterative1<T1> from(T1 t1);

        public <T1, T2> Iterative2<T1, T2> from(T1 t1, T2 t2);

        public <T1, T2, T3> Iterative3<T1, T2, T3> from(T1 t1, T2 t2, T3 t3);

        public <T1, T2, T3, T4> Iterative4<T1, T2, T3, T4> from(T1 t1, T2 t2, T3 t3, T4 t4);

        public <T1, T2, T3, T4, T5> Iterative5<T1, T2, T3, T4, T5> from(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5);

        public <T1, T2, T3, T4, T5, T6> Iterative6<T1, T2, T3, T4, T5, T6> from(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6);

        public <T1, T2, T3, T4, T5, T6, T7> Iterative7<T1, T2, T3, T4, T5, T6, T7> from(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7);

        public <T1, T2, T3, T4, T5, T6, T7, T8> Iterative8<T1, T2, T3, T4, T5, T6, T7, T8> from(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7, T8 t8);

        public Iterative0 of();

        public <T1> Iterative1<T1> of(Iterable<? extends T1> i1);

        public <T1, T2> Iterative2<T1, T2> of(Iterable<? extends T1> i1, Iterable<? extends T2> i2);

        public <T1, T2> Iterative2<T1, T2> of(Iterative1<? extends T1> i1, Iterable<? extends T2> i2);

        public <T1, T2, T3> Iterative3<T1, T2, T3> of(Iterable<? extends T1> i1, Iterable<? extends T2> i2, Iterable<? extends T3> i3);

        public <T1, T2, T3> Iterative3<T1, T2, T3> of(Iterative2<? extends T1, ? extends T2> i1, Iterable<? extends T3> i2);

        public <T1, T2, T3, T4> Iterative4<T1, T2, T3, T4> of(Iterable<? extends T1> i1, Iterable<? extends T2> i2, Iterable<? extends T3> i3, Iterable<? extends T4> i4);

        public <T1, T2, T3, T4> Iterative4<T1, T2, T3, T4> of(Iterative3<? extends T1, ? extends T2, ? extends T3> i1, Iterable<? extends T4> i2);

        public <T1, T2, T3, T4, T5> Iterative5<T1, T2, T3, T4, T5> of(Iterable<? extends T1> i1, Iterable<? extends T2> i2, Iterable<? extends T3> i3, Iterable<? extends T4> i4, Iterable<? extends T5> i5);

        public <T1, T2, T3, T4, T5> Iterative5<T1, T2, T3, T4, T5> of(Iterative4<? extends T1, ? extends T2, ? extends T3, ? extends T4> i1, Iterable<? extends T5> i2);

        public <T1, T2, T3, T4, T5, T6> Iterative6<T1, T2, T3, T4, T5, T6> of(Iterable<? extends T1> i1, Iterable<? extends T2> i2, Iterable<? extends T3> i3, Iterable<? extends T4> i4, Iterable<? extends T5> i5, Iterable<? extends T6> i6);

        public <T1, T2, T3, T4, T5, T6> Iterative6<T1, T2, T3, T4, T5, T6> of(Iterative5<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5> i1, Iterable<? extends T6> i2);

        public <T1, T2, T3, T4, T5, T6, T7> Iterative7<T1, T2, T3, T4, T5, T6, T7> of(Iterable<? extends T1> i1, Iterable<? extends T2> i2, Iterable<? extends T3> i3, Iterable<? extends T4> i4, Iterable<? extends T5> i5, Iterable<? extends T6> i6, Iterable<? extends T7> i7);

        public <T1, T2, T3, T4, T5, T6, T7> Iterative7<T1, T2, T3, T4, T5, T6, T7> of(Iterative6<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6> i1, Iterable<? extends T7> i2);

        public <T1, T2, T3, T4, T5, T6, T7, T8> Iterative8<T1, T2, T3, T4, T5, T6, T7, T8> of(Iterable<? extends T1> i1, Iterable<? extends T2> i2, Iterable<? extends T3> i3, Iterable<? extends T4> i4, Iterable<? extends T5> i5, Iterable<? extends T6> i6, Iterable<? extends T7> i7, Iterable<? extends T8> i8);

        public <T1, T2, T3, T4, T5, T6, T7, T8> Iterative8<T1, T2, T3, T4, T5, T6, T7, T8> of(Iterative7<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6, ? extends T7> i1, Iterable<? extends T8> i2);

        public <T1> Iterative1<T1> by(Iterable<? extends Stream<? extends T1>> i1);

        public <T1, T2> Iterative2<T1, T2> by(Iterable<? extends Stream<? extends T1>> i1, Iterable<? extends Stream<? extends T2>> i2);

        public <T1, T2> Iterative2<T1, T2> by(Iterative1<? extends T1> i1, Iterable<? extends Stream<? extends T2>> i2);

        public <T1, T2, T3> Iterative3<T1, T2, T3> by(Iterable<? extends Stream<? extends T1>> i1, Iterable<? extends Stream<? extends T2>> i2, Iterable<? extends Stream<? extends T3>> i3);

        public <T1, T2, T3> Iterative3<T1, T2, T3> by(Iterative2<? extends T1, ? extends T2> i1, Iterable<? extends Stream<? extends T3>> i2);

        public <T1, T2, T3, T4> Iterative4<T1, T2, T3, T4> by(Iterable<? extends Stream<? extends T1>> i1, Iterable<? extends Stream<? extends T2>> i2, Iterable<? extends Stream<? extends T3>> i3, Iterable<? extends Stream<? extends T4>> i4);

        public <T1, T2, T3, T4> Iterative4<T1, T2, T3, T4> by(Iterative3<? extends T1, ? extends T2, ? extends T3> i1, Iterable<? extends Stream<? extends T4>> i2);

        public <T1, T2, T3, T4, T5> Iterative5<T1, T2, T3, T4, T5> by(Iterable<? extends Stream<? extends T1>> i1, Iterable<? extends Stream<? extends T2>> i2, Iterable<? extends Stream<? extends T3>> i3, Iterable<? extends Stream<? extends T4>> i4, Iterable<? extends Stream<? extends T5>> i5);

        public <T1, T2, T3, T4, T5> Iterative5<T1, T2, T3, T4, T5> by(Iterative4<? extends T1, ? extends T2, ? extends T3, ? extends T4> i1, Iterable<? extends Stream<? extends T5>> i2);

        public <T1, T2, T3, T4, T5, T6> Iterative6<T1, T2, T3, T4, T5, T6> by(Iterable<? extends Stream<? extends T1>> i1, Iterable<? extends Stream<? extends T2>> i2, Iterable<? extends Stream<? extends T3>> i3, Iterable<? extends Stream<? extends T4>> i4, Iterable<? extends Stream<? extends T5>> i5, Iterable<? extends Stream<? extends T6>> i6);

        public <T1, T2, T3, T4, T5, T6> Iterative6<T1, T2, T3, T4, T5, T6> by(Iterative5<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5> i1, Iterable<? extends Stream<? extends T6>> i2);

        public <T1, T2, T3, T4, T5, T6, T7> Iterative7<T1, T2, T3, T4, T5, T6, T7> by(Iterable<? extends Stream<? extends T1>> i1, Iterable<? extends Stream<? extends T2>> i2, Iterable<? extends Stream<? extends T3>> i3, Iterable<? extends Stream<? extends T4>> i4, Iterable<? extends Stream<? extends T5>> i5, Iterable<? extends Stream<? extends T6>> i6, Iterable<? extends Stream<? extends T7>> i7);

        public <T1, T2, T3, T4, T5, T6, T7> Iterative7<T1, T2, T3, T4, T5, T6, T7> by(Iterative6<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6> i1, Iterable<? extends Stream<? extends T7>> i2);

        public <T1, T2, T3, T4, T5, T6, T7, T8> Iterative8<T1, T2, T3, T4, T5, T6, T7, T8> by(Iterable<? extends Stream<? extends T1>> i1, Iterable<? extends Stream<? extends T2>> i2, Iterable<? extends Stream<? extends T3>> i3, Iterable<? extends Stream<? extends T4>> i4, Iterable<? extends Stream<? extends T5>> i5, Iterable<? extends Stream<? extends T6>> i6, Iterable<? extends Stream<? extends T7>> i7, Iterable<? extends Stream<? extends T8>> i8);

        public <T1, T2, T3, T4, T5, T6, T7, T8> Iterative8<T1, T2, T3, T4, T5, T6, T7, T8> by(Iterative7<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6, ? extends T7> i1, Iterable<? extends Stream<? extends T8>> i2);

        public Iterative0 empty0();

        public <T1> Iterative1<T1> empty1();

        public <T1, T2> Iterative2<T1, T2> empty2();

        public <T1, T2, T3> Iterative3<T1, T2, T3> empty3();

        public <T1, T2, T3, T4> Iterative4<T1, T2, T3, T4> empty4();

        public <T1, T2, T3, T4, T5> Iterative5<T1, T2, T3, T4, T5> empty5();

        public <T1, T2, T3, T4, T5, T6> Iterative6<T1, T2, T3, T4, T5, T6> empty6();

        public <T1, T2, T3, T4, T5, T6, T7> Iterative7<T1, T2, T3, T4, T5, T6, T7> empty7();

        public <T1, T2, T3, T4, T5, T6, T7, T8> Iterative8<T1, T2, T3, T4, T5, T6, T7, T8> empty8();
    }

    public static interface IterativeBuilderTupleInline extends IterativeBuilderTuple {

        public <T1, T2> Iterative2Inline<T1, T2> from(Tuple2<? extends T1, ? extends T2> t1);

        public <T1, T2, T3> Iterative3Inline<T1, T2, T3> from(Tuple3<? extends T1, ? extends T2, ? extends T3> t1);

        public <T1, T2, T3, T4> Iterative4Inline<T1, T2, T3, T4> from(Tuple4<? extends T1, ? extends T2, ? extends T3, ? extends T4> t1);

        public <T1, T2, T3, T4, T5> Iterative5Inline<T1, T2, T3, T4, T5> from(Tuple5<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5> t1);

        public <T1, T2, T3, T4, T5, T6> Iterative6Inline<T1, T2, T3, T4, T5, T6> from(Tuple6<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6> t1);

        public <T1, T2, T3, T4, T5, T6, T7> Iterative7Inline<T1, T2, T3, T4, T5, T6, T7> from(Tuple7<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6, ? extends T7> t1);

        public <T1, T2, T3, T4, T5, T6, T7, T8> Iterative8Inline<T1, T2, T3, T4, T5, T6, T7, T8> from(Tuple8<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6, ? extends T7, ? extends T8> t1);

        public <T1, T2> Iterative2Inline<T1, T2> of(Tuple2<? extends Iterable<? extends T1>, ? extends Iterable<? extends T2>> i1);

        public <T1, T2, T3> Iterative3Inline<T1, T2, T3> of(Tuple3<? extends Iterable<? extends T1>, ? extends Iterable<? extends T2>, ? extends Iterable<? extends T3>> i1);

        public <T1, T2, T3, T4> Iterative4Inline<T1, T2, T3, T4> of(Tuple4<? extends Iterable<? extends T1>, ? extends Iterable<? extends T2>, ? extends Iterable<? extends T3>, ? extends Iterable<? extends T4>> i1);

        public <T1, T2, T3, T4, T5> Iterative5Inline<T1, T2, T3, T4, T5> of(Tuple5<? extends Iterable<? extends T1>, ? extends Iterable<? extends T2>, ? extends Iterable<? extends T3>, ? extends Iterable<? extends T4>, ? extends Iterable<? extends T5>> i1);

        public <T1, T2, T3, T4, T5, T6> Iterative6Inline<T1, T2, T3, T4, T5, T6> of(Tuple6<? extends Iterable<? extends T1>, ? extends Iterable<? extends T2>, ? extends Iterable<? extends T3>, ? extends Iterable<? extends T4>, ? extends Iterable<? extends T5>, ? extends Iterable<? extends T6>> i1);

        public <T1, T2, T3, T4, T5, T6, T7> Iterative7Inline<T1, T2, T3, T4, T5, T6, T7> of(Tuple7<? extends Iterable<? extends T1>, ? extends Iterable<? extends T2>, ? extends Iterable<? extends T3>, ? extends Iterable<? extends T4>, ? extends Iterable<? extends T5>, ? extends Iterable<? extends T6>, ? extends Iterable<? extends T7>> i1);

        public <T1, T2, T3, T4, T5, T6, T7, T8> Iterative8Inline<T1, T2, T3, T4, T5, T6, T7, T8> of(Tuple8<? extends Iterable<? extends T1>, ? extends Iterable<? extends T2>, ? extends Iterable<? extends T3>, ? extends Iterable<? extends T4>, ? extends Iterable<? extends T5>, ? extends Iterable<? extends T6>, ? extends Iterable<? extends T7>, ? extends Iterable<? extends T8>> i1);
    }

    public static interface IterativeBuilderTupleCross extends IterativeBuilderTuple {

        public <T1, T2> Iterative2Cross<T1, T2> from(Tuple2<? extends T1, ? extends T2> t1);

        public <T1, T2, T3> Iterative3Cross<T1, T2, T3> from(Tuple3<? extends T1, ? extends T2, ? extends T3> t1);

        public <T1, T2, T3, T4> Iterative4Cross<T1, T2, T3, T4> from(Tuple4<? extends T1, ? extends T2, ? extends T3, ? extends T4> t1);

        public <T1, T2, T3, T4, T5> Iterative5Cross<T1, T2, T3, T4, T5> from(Tuple5<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5> t1);

        public <T1, T2, T3, T4, T5, T6> Iterative6Cross<T1, T2, T3, T4, T5, T6> from(Tuple6<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6> t1);

        public <T1, T2, T3, T4, T5, T6, T7> Iterative7Cross<T1, T2, T3, T4, T5, T6, T7> from(Tuple7<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6, ? extends T7> t1);

        public <T1, T2, T3, T4, T5, T6, T7, T8> Iterative8Cross<T1, T2, T3, T4, T5, T6, T7, T8> from(Tuple8<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6, ? extends T7, ? extends T8> t1);

        public <T1, T2> Iterative2Cross<T1, T2> of(Tuple2<? extends Iterable<? extends T1>, ? extends Iterable<? extends T2>> i1);

        public <T1, T2, T3> Iterative3Cross<T1, T2, T3> of(Tuple3<? extends Iterable<? extends T1>, ? extends Iterable<? extends T2>, ? extends Iterable<? extends T3>> i1);

        public <T1, T2, T3, T4> Iterative4Cross<T1, T2, T3, T4> of(Tuple4<? extends Iterable<? extends T1>, ? extends Iterable<? extends T2>, ? extends Iterable<? extends T3>, ? extends Iterable<? extends T4>> i1);

        public <T1, T2, T3, T4, T5> Iterative5Cross<T1, T2, T3, T4, T5> of(Tuple5<? extends Iterable<? extends T1>, ? extends Iterable<? extends T2>, ? extends Iterable<? extends T3>, ? extends Iterable<? extends T4>, ? extends Iterable<? extends T5>> i1);

        public <T1, T2, T3, T4, T5, T6> Iterative6Cross<T1, T2, T3, T4, T5, T6> of(Tuple6<? extends Iterable<? extends T1>, ? extends Iterable<? extends T2>, ? extends Iterable<? extends T3>, ? extends Iterable<? extends T4>, ? extends Iterable<? extends T5>, ? extends Iterable<? extends T6>> i1);

        public <T1, T2, T3, T4, T5, T6, T7> Iterative7Cross<T1, T2, T3, T4, T5, T6, T7> of(Tuple7<? extends Iterable<? extends T1>, ? extends Iterable<? extends T2>, ? extends Iterable<? extends T3>, ? extends Iterable<? extends T4>, ? extends Iterable<? extends T5>, ? extends Iterable<? extends T6>, ? extends Iterable<? extends T7>> i1);

        public <T1, T2, T3, T4, T5, T6, T7, T8> Iterative8Cross<T1, T2, T3, T4, T5, T6, T7, T8> of(Tuple8<? extends Iterable<? extends T1>, ? extends Iterable<? extends T2>, ? extends Iterable<? extends T3>, ? extends Iterable<? extends T4>, ? extends Iterable<? extends T5>, ? extends Iterable<? extends T6>, ? extends Iterable<? extends T7>, ? extends Iterable<? extends T8>> i1);
    }

    public static interface IterativeBuilderTuple extends IterativeBuilder {

        public <T1> Iterative1<T1> from(Tuple1<? extends T1> t1);

        public <T1, T2> Iterative2<T1, T2> from(Tuple2<? extends T1, ? extends T2> t1);

        public <T1, T2, T3> Iterative3<T1, T2, T3> from(Tuple3<? extends T1, ? extends T2, ? extends T3> t1);

        public <T1, T2, T3, T4> Iterative4<T1, T2, T3, T4> from(Tuple4<? extends T1, ? extends T2, ? extends T3, ? extends T4> t1);

        public <T1, T2, T3, T4, T5> Iterative5<T1, T2, T3, T4, T5> from(Tuple5<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5> t1);

        public <T1, T2, T3, T4, T5, T6> Iterative6<T1, T2, T3, T4, T5, T6> from(Tuple6<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6> t1);

        public <T1, T2, T3, T4, T5, T6, T7> Iterative7<T1, T2, T3, T4, T5, T6, T7> from(Tuple7<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6, ? extends T7> t1);

        public <T1, T2, T3, T4, T5, T6, T7, T8> Iterative8<T1, T2, T3, T4, T5, T6, T7, T8> from(Tuple8<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6, ? extends T7, ? extends T8> t1);

        public <T1> Iterative1<T1> of(Tuple1<? extends Iterable<? extends T1>> t1);

        public <T1, T2> Iterative2<T1, T2> of(Tuple2<? extends Iterable<? extends T1>, ? extends Iterable<? extends T2>> i1);

        public <T1, T2, T3> Iterative3<T1, T2, T3> of(Tuple3<? extends Iterable<? extends T1>, ? extends Iterable<? extends T2>, ? extends Iterable<? extends T3>> i1);

        public <T1, T2, T3, T4> Iterative4<T1, T2, T3, T4> of(Tuple4<? extends Iterable<? extends T1>, ? extends Iterable<? extends T2>, ? extends Iterable<? extends T3>, ? extends Iterable<? extends T4>> i1);

        public <T1, T2, T3, T4, T5> Iterative5<T1, T2, T3, T4, T5> of(Tuple5<? extends Iterable<? extends T1>, ? extends Iterable<? extends T2>, ? extends Iterable<? extends T3>, ? extends Iterable<? extends T4>, ? extends Iterable<? extends T5>> i1);

        public <T1, T2, T3, T4, T5, T6> Iterative6<T1, T2, T3, T4, T5, T6> of(Tuple6<? extends Iterable<? extends T1>, ? extends Iterable<? extends T2>, ? extends Iterable<? extends T3>, ? extends Iterable<? extends T4>, ? extends Iterable<? extends T5>, ? extends Iterable<? extends T6>> i1);

        public <T1, T2, T3, T4, T5, T6, T7> Iterative7<T1, T2, T3, T4, T5, T6, T7> of(Tuple7<? extends Iterable<? extends T1>, ? extends Iterable<? extends T2>, ? extends Iterable<? extends T3>, ? extends Iterable<? extends T4>, ? extends Iterable<? extends T5>, ? extends Iterable<? extends T6>, ? extends Iterable<? extends T7>> i1);

        public <T1, T2, T3, T4, T5, T6, T7, T8> Iterative8<T1, T2, T3, T4, T5, T6, T7, T8> of(Tuple8<? extends Iterable<? extends T1>, ? extends Iterable<? extends T2>, ? extends Iterable<? extends T3>, ? extends Iterable<? extends T4>, ? extends Iterable<? extends T5>, ? extends Iterable<? extends T6>, ? extends Iterable<? extends T7>, ? extends Iterable<? extends T8>> i1);
    }

    public static interface IterativeBuilderAccess extends IterativeBuilder {

        public IterativeBuilder nullable();

        public IterativeBuilder nonNullable();
    }

    public static interface IterativeBuilderArgument extends IterativeBuilder {

        public IterativeBuilder regularArgs();

        public IterativeBuilder tupleArgs();
    }

    public static interface IterativeBuilderIterate extends IterativeBuilder {

        public IterativeBuilder cross();

        public IterativeBuilder inline();
    }

    public static enum Argument {
        TUPLE,
        REGULAR;

    }

    public static enum Access {
        NULLABLE,
        NON_NULLABLE;

    }

    public static enum Iterate {
        CROSS,
        INLINE;

    }

}
