package com.fiberg.iterative.function;

import com.fiberg.iterative.core.IterativeInternals;
import io.vavr.Function1;
import io.vavr.Tuple;
import io.vavr.Tuple1;

import java.util.Objects;
import java.util.function.Predicate;

@FunctionalInterface
public interface Pr1<T1> extends Predicate<T1>, Function1<T1, Boolean> {

    default public Boolean apply(T1 t1) {
        return this.test(t1);
    }

    public static <T1> Pr1<T1> narrow(Pr1<? super T1> p) {
        @SuppressWarnings("unchecked")
        final Pr1<T1> pr = (Pr1<T1>) p;
        return pr;
    }

    public static <T1> Pr1<T1> empty() {
        return IterativeInternals::none;
    }

    public static <T1> Pr1<T1> value(Boolean b) {
        return t1 -> b;
    }

    public static <T1 extends Boolean> Pr1<T1> identity() {
        return IterativeInternals::identity;
    }

    public static <T1> Pr1<T1> of(Pr1<? super T1> p) {
        return Pr1.narrow(p);
    }

    public static <T1> Pr1<T1> fromFunction(Fn1<? super T1, Boolean> f) {
        return f::apply;
    }

    public static <T1> Pr1<T1> fromSupplier(Sp<? extends Boolean> s) {
        return Pr1.fromFunction(Sp.<Boolean>narrow(s).toFunction().ignoring1());
    }

    public static <T1> Pr1<T1> negate(Pr1<? super T1> p) {
        return Pr1.<T1>narrow(p.negated());
    }

    @SafeVarargs
    public static <T1> Pr1<T1> and(Pr1<? super T1> ... ps) {
        Objects.requireNonNull(ps, "ps is null");
        return Predicates.and(ps);
    }

    public static <T1> Pr1<T1> and(Pr1<? super T1> p, Pr0 ... ps) {
        Objects.requireNonNull(p, "p is null");
        Objects.requireNonNull(ps, "ps is null");
        return ps.length == 0 ? Pr1.narrow(p) : Pr1.<T1>narrow(p).and(Predicates.and(ps));
    }

    @SafeVarargs
    public static <T1> Pr1<T1> or(Pr1<? super T1> ... ps) {
        Objects.requireNonNull(ps, "ps is null");
        return Predicates.or(ps);
    }

    public static <T1> Pr1<T1> or(Pr1<? super T1> p, Pr0 ... ps) {
        Objects.requireNonNull(p, "p is null");
        Objects.requireNonNull(ps, "ps is null");
        return ps.length == 0 ? Pr1.narrow(p) : Pr1.<T1>narrow(p).or(Predicates.or(ps));
    }

    public static <T1> Pr1<Tuple1<T1>> tuple(Pr1<? super T1> p) {
        return Pr1.<T1>of(p).tupled();
    }

    public static <T1> Pr1<T1> detuple(Pr1<? super Tuple1<? extends T1>> p) {
        return t1 -> p.test(Tuple.of(t1));
    }

    public static <T1> Pr1<T1> uncheck(Prc1<? super T1> p) {
        Objects.requireNonNull(p, "p is null");
        return Prc1.<T1>narrow(p).unchecked();
    }

    public static <T1> Pr1<T1> ignore(Pr0 p) {
        return p.ignoring1();
    }

    public static <T1, T2> Pr1<T1> passRt(Pr2<? super T1, ? super T2> p, T2 t2) {
        return Pr1.narrow(p.testRt(t2));
    }

    public static <T1, T2, T3> Pr1<T1> passRt(Pr3<? super T1, ? super T2, ? super T3> p, T2 t2, T3 t3) {
        return Pr1.narrow(p.testRt(t2, t3));
    }

    public static <T1, T2, T3, T4> Pr1<T1> passRt(Pr4<? super T1, ? super T2, ? super T3, ? super T4> p, T2 t2, T3 t3, T4 t4) {
        return Pr1.narrow(p.testRt(t2, t3, t4));
    }

    public static <T1, T2, T3, T4, T5> Pr1<T1> passRt(Pr5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5> p, T2 t2, T3 t3, T4 t4, T5 t5) {
        return Pr1.narrow(p.testRt(t2, t3, t4, t5));
    }

    public static <T1, T2, T3, T4, T5, T6> Pr1<T1> passRt(Pr6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6> p, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6) {
        return Pr1.narrow(p.testRt(t2, t3, t4, t5, t6));
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Pr1<T1> passRt(Pr7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7> p, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7) {
        return Pr1.narrow(p.testRt(t2, t3, t4, t5, t6, t7));
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Pr1<T1> passRt(Pr8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8> p, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7, T8 t8) {
        return Pr1.narrow(p.testRt(t2, t3, t4, t5, t6, t7, t8));
    }

    public static <T1, T2> Pr1<T2> passLt(Pr2<? super T1, ? super T2> p, T1 t1) {
        return Pr1.narrow(p.testLt(t1));
    }

    public static <T1, T2, T3> Pr1<T3> passLt(Pr3<? super T1, ? super T2, ? super T3> p, T1 t1, T2 t2) {
        return Pr1.narrow(p.testLt(t1, t2));
    }

    public static <T1, T2, T3, T4> Pr1<T4> passLt(Pr4<? super T1, ? super T2, ? super T3, ? super T4> p, T1 t1, T2 t2, T3 t3) {
        return Pr1.narrow(p.testLt(t1, t2, t3));
    }

    public static <T1, T2, T3, T4, T5> Pr1<T5> passLt(Pr5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5> p, T1 t1, T2 t2, T3 t3, T4 t4) {
        return Pr1.narrow(p.testLt(t1, t2, t3, t4));
    }

    public static <T1, T2, T3, T4, T5, T6> Pr1<T6> passLt(Pr6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6> p, T1 t1, T2 t2, T3 t3, T4 t4, T5 t5) {
        return Pr1.narrow(p.testLt(t1, t2, t3, t4, t5));
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Pr1<T7> passLt(Pr7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7> p, T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6) {
        return Pr1.narrow(p.testLt(t1, t2, t3, t4, t5, t6));
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Pr1<T8> passLt(Pr8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8> p, T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7) {
        return Pr1.narrow(p.testLt(t1, t2, t3, t4, t5, t6, t7));
    }

    public static <T1> boolean passAndTest(Pr1<? super T1> p, T1 t1) {
        return Pr0.pass(p, t1).test();
    }

    default public Fn1<T1, Boolean> toFunction() {
        return this::test;
    }

    default public Cs1<T1> toConsumer() {
        return this::test;
    }

    default public Pr0 toPredicate(T1 t1) {
        return () -> this.test(t1);
    }

    default public Sp<Boolean> toSupplier(T1 t1) {
        return this.toPredicate(t1).toSupplier();
    }

    default public Rn toRunnable(T1 t1) {
        return this.toPredicate(t1).toRunnable();
    }

    default public <R> R passEvaluated(Sp<? extends R> onSuccess, Sp<? extends R> onFailure, T1 t1) {
        return this.toPredicate(t1).evaluated(onSuccess, onFailure);
    }

    default public <R> R passEvaluated(Sp<? extends R> onSuccess, R onFailure, T1 t1) {
        return this.toPredicate(t1).evaluated(onSuccess, onFailure);
    }

    default public <R> R passEvaluated(R onSuccess, Sp<? extends R> onFailure, T1 t1) {
        return this.toPredicate(t1).evaluated(onSuccess, onFailure);
    }

    default public <R> R passEvaluated(R onSuccess, R onFailure, T1 t1) {
        return this.toPredicate(t1).evaluated(onSuccess, onFailure);
    }

    default public <R> R passEvaluatedOnSuccess(Sp<? extends R> onSuccess, T1 t1) {
        return this.toPredicate(t1).evaluatedOnSuccess(onSuccess);
    }

    default public <R> R passEvaluatedOnFailure(Sp<? extends R> onFailure, T1 t1) {
        return this.toPredicate(t1).evaluatedOnFailure(onFailure);
    }

    default public <R> R passEvaluatedOnSuccess(R onSuccess, T1 t1) {
        return this.toPredicate(t1).evaluatedOnSuccess(onSuccess);
    }

    default public <R> R passEvaluatedOnFailure(R onFailure, T1 t1) {
        return this.toPredicate(t1).evaluatedOnFailure(onFailure);
    }

    default public Pr1<T1> afterRunOn(Rn onSuccess, Rn onFailure) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return t1 -> {
            boolean result = this.test(t1);
            (result ? onSuccess : onFailure).run();
            return result;
        };
    }

    default public Pr1<T1> afterTestOn(Pr1<Boolean> onSuccess, Pr1<Boolean> onFailure) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return this.afterApplyOn(onSuccess.toFunction(), onFailure.toFunction());
    }

    default public Pr1<T1> afterTestOn(Pr0 onSuccess, Pr0 onFailure) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return this.afterTestOn(onSuccess.ignoring1(), onFailure.ignoring1());
    }

    default public Pr1<T1> afterApplyOn(Fn1<Boolean, Boolean> onSuccess, Fn1<Boolean, Boolean> onFailure) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return Pr1.fromFunction(this.afterApplyOnTo(onSuccess, onFailure));
    }

    default public <R> Fn1<T1, R> afterApplyOnTo(Fn1<Boolean, ? extends R> onSuccess, Fn1<Boolean, ? extends R> onFailure) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return t1 -> {
            boolean result = this.test(t1);
            return (result ? onSuccess : onFailure).apply(result);
        };
    }

    default public Pr1<T1> afterApplyOn(Fn0<Boolean> onSuccess, Fn0<Boolean> onFailure) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return this.afterApplyOn(onFailure.ignoring1(), onFailure.ignoring1());
    }

    default public <R> Fn1<T1, R> afterApplyOnTo(Fn0<? extends R> onSuccess, Fn0<? extends R> onFailure) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return this.afterApplyOnTo(onSuccess.ignoring1(), onFailure.ignoring1());
    }

    default public Pr1<T1> afterGetOn(Sp<Boolean> onSuccess, Sp<Boolean> onFailure) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return this.afterApplyOn(onSuccess.ignoring1(), onFailure.ignoring1());
    }

    default public Cs1<T1> afterAcceptOnTo(Cs1<Boolean> onSuccess, Cs1<Boolean> onFailure) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return this.afterApplyOnTo(onSuccess.toFunction(null), onFailure.toFunction(null)).toConsumer();
    }

    default public Pr1<T1> afterAcceptOn(Cs1<Boolean> onSuccess, Cs1<Boolean> onFailure) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return this.afterApplyOn(onSuccess.toFunction(null), onFailure.toFunction(null));
    }

    default public Pr1<T1> afterRun(Rn r) {
        return this.afterRunOn(r, r);
    }

    default public Pr1<T1> afterTest(Pr1<Boolean> p) {
        return this.afterTestOn(p, p);
    }

    default public Pr1<T1> afterTest(Pr0 p) {
        return this.afterTestOn(p, p);
    }

    default public Pr1<T1> afterApply(Fn1<Boolean, Boolean> f) {
        return this.afterApplyOn(f, f);
    }

    default public <R> Fn1<T1, R> afterApplyTo(Fn1<Boolean, ? extends R> f) {
        return this.afterApplyOnTo(f, f);
    }

    default public Pr1<T1> afterApply(Fn0<Boolean> f) {
        return this.afterApplyOn(f, f);
    }

    default public <R> Fn1<T1, R> afterApplyTo(Fn0<? extends R> f) {
        return this.afterApplyOnTo(f, f);
    }

    default public Pr1<T1> afterGet(Sp<Boolean> s) {
        return this.afterGetOn(s, s);
    }

    default public Cs1<T1> afterAcceptTo(Cs1<Boolean> c) {
        return this.afterAcceptOnTo(c, c);
    }

    default public Pr1<T1> afterAccept(Cs1<Boolean> c) {
        return this.afterAcceptOn(c, c);
    }

    default public Pr1<T1> beforeWrap(Pr1<? super Spc<Boolean>> wrap) {
        return Pr1.fromFunction(this.beforeWrapTo(wrap.toFunction()));
    }

    default public <W> Fn1<T1, W> beforeWrapTo(Fn1<? super Spc<Boolean>, ? extends W> wrap) {
        return t1 -> wrap.apply(this.toSupplier(t1).checked());
    }

    default public Pr1<T1> afterRunOnSuccess(Rn r) {
        return this.afterRunOn(r, Rn.empty());
    }

    default public Pr1<T1> afterTestOnSuccess(Pr1<Boolean> p) {
        return this.afterTestOn(p, Pr1.empty());
    }

    default public Pr1<T1> afterTestOnSuccess(Pr0 p) {
        return this.afterTestOn(p, Pr0.empty());
    }

    default public Pr1<T1> afterApplyOnSuccess(Fn1<Boolean, Boolean> f) {
        return this.afterApplyOn(f, Fn1.empty());
    }

    default public <R> Fn1<T1, R> afterApplyOnSuccessTo(Fn1<Boolean, ? extends R> f) {
        return this.afterApplyOnTo(f, Fn1.empty());
    }

    default public Pr1<T1> afterApplyOnSuccess(Fn0<Boolean> f) {
        return this.afterApplyOn(f, Fn0.empty());
    }

    default public <R> Fn1<T1, R> afterApplyOnSuccessTo(Fn0<? extends R> f) {
        return this.afterApplyOnTo(f, Fn0.empty());
    }

    default public Pr1<T1> afterGetOnSuccess(Sp<Boolean> s) {
        return this.afterGetOn(s, Sp.empty());
    }

    default public Cs1<T1> afterAcceptOnSuccessTo(Cs1<Boolean> c) {
        return this.afterAcceptOnTo(c, Cs1.empty());
    }

    default public Pr1<T1> afterAcceptOnSuccess(Cs1<Boolean> c) {
        return this.afterAcceptOn(c, Cs1.empty());
    }

    default public Pr1<T1> afterRunOnFailure(Rn r) {
        return this.negated().afterRunOnSuccess(r);
    }

    default public Pr1<T1> afterTestOnFailure(Pr1<Boolean> p) {
        return this.negated().afterTestOnSuccess(p);
    }

    default public Pr1<T1> afterTestOnFailure(Pr0 p) {
        return this.negated().afterTestOnSuccess(p);
    }

    default public Pr1<T1> afterApplyOnFailure(Fn1<Boolean, Boolean> f) {
        return this.negated().afterApplyOnSuccess(f);
    }

    default public <R> Fn1<T1, R> afterApplyOnFailureTo(Fn1<Boolean, ? extends R> f) {
        return this.negated().afterApplyOnSuccessTo(f);
    }

    default public Pr1<T1> afterApplyOnFailure(Fn0<Boolean> f) {
        return this.negated().afterApplyOnSuccess(f);
    }

    default public <R> Fn1<T1, R> afterApplyOnFailureTo(Fn0<? extends R> f) {
        return this.negated().afterApplyOnSuccessTo(f);
    }

    default public Pr1<T1> afterGetOnFailure(Sp<Boolean> s) {
        return this.negated().afterGetOnSuccess(s);
    }

    default public Cs1<T1> afterAcceptOnFailureTo(Cs1<Boolean> c) {
        return this.negated().afterAcceptOnSuccessTo(c);
    }

    default public Pr1<T1> afterAcceptOnFailure(Cs1<Boolean> c) {
        return this.negated().afterAcceptOnSuccess(c);
    }

    default public Pr1<T1> beforeRun(Rn r) {
        Objects.requireNonNull(r, "r is null");
        return t1 -> {
            r.run();
            return this.test(t1);
        };
    }

    default public <B1> Pr1<B1> beforeApply(Fn1<? super B1, ? extends T1> f) {
        return this.beforeApply1(f);
    }

    default public <B1> Pr1<B1> beforeApply1(Fn1<? super B1, ? extends T1> f) {
        Objects.requireNonNull(f, "f is null");
        return b1 -> this.test(f.apply(b1));
    }

    default public <B1, B2> Pr2<B1, B2> beforeApply2(Fn2<? super B1, ? super B2, ? extends T1> f) {
        Objects.requireNonNull(f, "f is null");
        return (b1, b2) -> this.test(f.apply(b1, b2));
    }

    default public <B1, B2, B3> Pr3<B1, B2, B3> beforeApply3(Fn3<? super B1, ? super B2, ? super B3, ? extends T1> f) {
        Objects.requireNonNull(f, "f is null");
        return (b1, b2, b3) -> this.test(f.apply(b1, b2, b3));
    }

    default public <B1, B2, B3, B4> Pr4<B1, B2, B3, B4> beforeApply4(Fn4<? super B1, ? super B2, ? super B3, ? super B4, ? extends T1> f) {
        Objects.requireNonNull(f, "f is null");
        return (b1, b2, b3, b4) -> this.test(f.apply(b1, b2, b3, b4));
    }

    default public <B1, B2, B3, B4, B5> Pr5<B1, B2, B3, B4, B5> beforeApply5(Fn5<? super B1, ? super B2, ? super B3, ? super B4, ? super B5, ? extends T1> f) {
        Objects.requireNonNull(f, "f is null");
        return (b1, b2, b3, b4, b5) -> this.test(f.apply(b1, b2, b3, b4, b5));
    }

    default public <B1, B2, B3, B4, B5, B6> Pr6<B1, B2, B3, B4, B5, B6> beforeApply6(Fn6<? super B1, ? super B2, ? super B3, ? super B4, ? super B5, ? super B6, ? extends T1> f) {
        Objects.requireNonNull(f, "f is null");
        return (b1, b2, b3, b4, b5, b6) -> this.test(f.apply(b1, b2, b3, b4, b5, b6));
    }

    default public <B1, B2, B3, B4, B5, B6, B7> Pr7<B1, B2, B3, B4, B5, B6, B7> beforeApply7(Fn7<? super B1, ? super B2, ? super B3, ? super B4, ? super B5, ? super B6, ? super B7, ? extends T1> f) {
        Objects.requireNonNull(f, "f is null");
        return (b1, b2, b3, b4, b5, b6, b7) -> this.test(f.apply(b1, b2, b3, b4, b5, b6, b7));
    }

    default public <B1, B2, B3, B4, B5, B6, B7, B8> Pr8<B1, B2, B3, B4, B5, B6, B7, B8> beforeApply8(Fn8<? super B1, ? super B2, ? super B3, ? super B4, ? super B5, ? super B6, ? super B7, ? super B8, ? extends T1> f) {
        Objects.requireNonNull(f, "f is null");
        return (b1, b2, b3, b4, b5, b6, b7, b8) -> this.test(f.apply(b1, b2, b3, b4, b5, b6, b7, b8));
    }

    default public Pr1<T1> beforeTestOnSuccess(Pr0 p, Pr1<? super T1> onFailure) {
        Objects.requireNonNull(p, "p is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return t1 -> p.test() ? this.test(t1) : onFailure.test(t1);
    }

    default public Pr1<T1> beforeTestOnSuccess(Pr0 p, Sp<? extends Boolean> onFailure) {
        return this.beforeTestOnSuccess(p, Pr1.fromSupplier(onFailure));
    }

    default public Pr1<T1> beforeTestOnSuccess(Pr0 p, Boolean onFailure) {
        return this.beforeTestOnSuccess(p, Pr1.value(onFailure));
    }

    default public Pr1<T1> beforeTestOnSuccess(Pr0 p) {
        return this.beforeTestOnSuccess(p, Pr1.empty());
    }

    default public Pr1<T1> beforeTestOnFailure(Pr0 p, Pr1<? super T1> onSuccess) {
        Objects.requireNonNull(p, "p is null");
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        return this.beforeTestOnSuccess(p.negated(), onSuccess);
    }

    default public Pr1<T1> beforeTestOnFailure(Pr0 p, Sp<? extends Boolean> onSuccess) {
        return this.beforeTestOnFailure(p, Pr1.fromSupplier(onSuccess));
    }

    default public Pr1<T1> beforeTestOnFailure(Pr0 p, Boolean onSuccess) {
        return this.beforeTestOnFailure(p, Pr1.value(onSuccess));
    }

    default public Pr1<T1> beforeTestOnFailure(Pr0 p) {
        return this.beforeTestOnFailure(p, Pr1.empty());
    }

    default public Pr0 beforeGet(Sp<? extends T1> s) {
        Objects.requireNonNull(s, "s is null");
        return () -> this.test(s.get());
    }

    default public <S> Pr1<T1> afterPassingThroughApplyOn(Fn1<? super T1, ? extends S> onSuccess, Fn1<? super T1, ? extends S> onFailure) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return t1 -> {
            boolean result = this.test(t1);
            Fn1.narrow(result ? onSuccess : onFailure).apply(t1);
            return result;
        };
    }

    default public <S> Fn1<T1, S> afterPassingThroughApplyOnTo(Fn1<? super T1, ? extends S> onSuccess, Fn1<? super T1, ? extends S> onFailure) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return t1 -> Fn1.narrow(this.test(t1) ? onSuccess : onFailure).apply(t1);
    }

    default public Pr1<T1> afterPassingThroughAcceptOn(Cs1<? super T1> onSuccess, Cs1<? super T1> onFailure) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return t1 -> {
            boolean result = this.test(t1);
            Cs1.narrow(result ? onSuccess : onFailure).accept(t1);
            return result;
        };
    }

    default public Cs1<T1> afterPassingThroughAcceptOnTo(Cs1<? super T1> onSuccess, Cs1<? super T1> onFailure) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return t1 -> Cs1.narrow(this.test(t1) ? onSuccess : onFailure).accept(t1);
    }

    default public Pr1<T1> afterPassingThroughTestOn(Pr1<? super T1> onSuccess, Pr1<? super T1> onFailure) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return t1 -> Pr1.narrow(this.test(t1) ? onSuccess : onFailure).test(t1);
    }

    default public <S> Pr1<T1> afterPassingThroughApply(Fn1<? super T1, ? extends S> f) {
        return this.afterPassingThroughApplyOn(f, f);
    }

    default public <S> Fn1<T1, S> afterPassingThroughApplyTo(Fn1<? super T1, ? extends S> f) {
        return this.afterPassingThroughApplyOnTo(f, f);
    }

    default public Pr1<T1> afterPassingThroughAccept(Cs1<? super T1> c) {
        return this.afterPassingThroughAcceptOn(c, c);
    }

    default public Cs1<T1> afterPassingThroughAcceptTo(Cs1<? super T1> c) {
        return this.afterPassingThroughAcceptOnTo(c, c);
    }

    default public Pr1<T1> afterPassingThroughTest(Pr1<? super T1> p) {
        return this.afterPassingThroughTestOn(p, p);
    }

    default public <S> Pr1<T1> afterSuccessPassingThroughApply(Fn1<? super T1, ? extends S> onSuccess) {
        return this.afterPassingThroughApplyOn(onSuccess, Fn1.empty());
    }

    default public <S> Fn1<T1, S> afterSuccessPassingThroughApplyTo(Fn1<? super T1, ? extends S> onSuccess) {
        return this.afterPassingThroughApplyOnTo(onSuccess, Fn1.empty());
    }

    default public Pr1<T1> afterSuccessPassingThroughAccept(Cs1<? super T1> onSuccess) {
        return this.afterPassingThroughAcceptOn(onSuccess, Cs1.empty());
    }

    default public Cs1<T1> afterSuccessPassingThroughAcceptTo(Cs1<? super T1> onSuccess) {
        return this.afterPassingThroughAcceptOnTo(onSuccess, Cs1.empty());
    }

    default public Pr1<T1> afterSuccessPassingThroughTest(Pr1<? super T1> onSuccess) {
        return this.afterPassingThroughTestOn(onSuccess, Pr1.empty());
    }

    default public <S> Pr1<T1> afterFailurePassingThroughApply(Fn1<? super T1, ? extends S> onFailure) {
        return this.negated().afterSuccessPassingThroughApply(onFailure);
    }

    default public <S> Fn1<T1, S> afterFailurePassingThroughApplyTo(Fn1<? super T1, ? extends S> onFailure) {
        return this.negated().afterSuccessPassingThroughApplyTo(onFailure);
    }

    default public Pr1<T1> afterFailurePassingThroughAccept(Cs1<? super T1> onFailure) {
        return this.negated().afterSuccessPassingThroughAccept(onFailure);
    }

    default public Cs1<T1> afterFailurePassingThroughAcceptTo(Cs1<? super T1> onFailure) {
        return this.negated().afterSuccessPassingThroughAcceptTo(onFailure);
    }

    default public Pr1<T1> afterFailurePassingThroughTest(Pr1<? super T1> onFailure) {
        return this.negated().afterSuccessPassingThroughTest(onFailure);
    }

    default public <R> Pr1<T1> beforePassingThroughApply(Fn1<? super T1, ? extends R> f) {
        Objects.requireNonNull(f, "f is null");
        return t1 -> {
            f.apply(t1);
            return this.test(t1);
        };
    }

    default public Pr1<T1> beforePassingThroughTest(Pr1<? super T1> p) {
        Objects.requireNonNull(p, "p is null");
        return t1 -> {
            p.test(t1);
            return this.test(t1);
        };
    }

    default public Pr1<T1> beforePassingThroughAccept(Cs1<? super T1> c) {
        Objects.requireNonNull(c, "c is null");
        return t1 -> {
            c.accept(t1);
            return this.test(t1);
        };
    }

    default public Pr1<T1> beforeSuccessPassingThroughTest(Pr1<? super T1> p, Pr1<? super T1> onFailure) {
        Objects.requireNonNull(p, "p is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return t1 -> p.test(t1) ? this.test(t1) : onFailure.test(t1);
    }

    default public Pr1<T1> beforeSuccessPassingThroughTest(Pr1<? super T1> p, Sp<? extends Boolean> onFailure) {
        return this.beforeSuccessPassingThroughTest(p, Pr1.fromSupplier(onFailure));
    }

    default public Pr1<T1> beforeSuccessPassingThroughTest(Pr1<? super T1> p, Boolean onFailure) {
        return this.beforeSuccessPassingThroughTest(p, Pr1.value(onFailure));
    }

    default public Pr1<T1> beforeSuccessPassingThroughTest(Pr1<? super T1> p) {
        return this.beforeSuccessPassingThroughTest(p, Pr1.empty());
    }

    default public Pr1<T1> beforeFailurePassingThroughTest(Pr1<? super T1> p, Pr1<? super T1> onSuccess) {
        Objects.requireNonNull(p, "p is null");
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        return this.beforeSuccessPassingThroughTest(p.negated(), onSuccess);
    }

    default public Pr1<T1> beforeFailurePassingThroughTest(Pr1<? super T1> p, Sp<? extends Boolean> onSuccess) {
        return this.beforeFailurePassingThroughTest(p, Pr1.fromSupplier(onSuccess));
    }

    default public Pr1<T1> beforeFailurePassingThroughTest(Pr1<? super T1> p, Boolean onSuccess) {
        return this.beforeFailurePassingThroughTest(p, Pr1.value(onSuccess));
    }

    default public Pr1<T1> beforeFailurePassingThroughTest(Pr1<? super T1> p) {
        return this.beforeFailurePassingThroughTest(p, Pr1.empty());
    }

    default public Pr1<Tuple1<T1>> tupled() {
        return tuple -> this.test(tuple._1());
    }

    default public Pr1<T1> currying() {
        return this;
    }

    default public Prc1<T1> checked() {
        return this::test;
    }

    default public Pr1<T1> negated() {
        return Predicate.super.negate()::test;
    }

    @Override
    default public Pr1<T1> and(Predicate<? super T1> p) {
        return Predicate.super.and(p)::test;
    }

    @Override
    default public Pr1<T1> or(Predicate<? super T1> p) {
        return Predicate.super.or(p)::test;
    }

    default public Pr1<T1> and(Pr0 p) {
        return t1 -> this.test(t1) && p.test();
    }

    default public Pr1<T1> or(Pr0 p) {
        return t1 -> this.test(t1) || p.test();
    }

    default public <I1> Pr2<I1, T1> ignoring1Lt() {
        return (i1, t1) -> this.test(t1);
    }

    default public <I1> Pr2<T1, I1> ignoring1Rt() {
        return (t1, i1) -> this.test(t1);
    }

    default public <I1, I2> Pr3<I1, I2, T1> ignoring2Lt() {
        return (i1, i2, t1) -> this.test(t1);
    }

    default public <I1, I2> Pr3<T1, I1, I2> ignoring2Rt() {
        return (t1, i1, i2) -> this.test(t1);
    }

    default public <I1, I2, I3> Pr4<I1, I2, I3, T1> ignoring3Lt() {
        return (i1, i2, i3, t1) -> this.test(t1);
    }

    default public <I1, I2, I3> Pr4<T1, I1, I2, I3> ignoring3Rt() {
        return (t1, i1, i2, i3) -> this.test(t1);
    }

    default public <I1, I2, I3, I4> Pr5<I1, I2, I3, I4, T1> ignoring4Lt() {
        return (i1, i2, i3, i4, t1) -> this.test(t1);
    }

    default public <I1, I2, I3, I4> Pr5<T1, I1, I2, I3, I4> ignoring4Rt() {
        return (t1, i1, i2, i3, i4) -> this.test(t1);
    }

    default public <I1, I2, I3, I4, I5> Pr6<I1, I2, I3, I4, I5, T1> ignoring5Lt() {
        return (i1, i2, i3, i4, i5, t1) -> this.test(t1);
    }

    default public <I1, I2, I3, I4, I5> Pr6<T1, I1, I2, I3, I4, I5> ignoring5Rt() {
        return (t1, i1, i2, i3, i4, i5) -> this.test(t1);
    }

    default public <I1, I2, I3, I4, I5, I6> Pr7<I1, I2, I3, I4, I5, I6, T1> ignoring6Lt() {
        return (i1, i2, i3, i4, i5, i6, t1) -> this.test(t1);
    }

    default public <I1, I2, I3, I4, I5, I6> Pr7<T1, I1, I2, I3, I4, I5, I6> ignoring6Rt() {
        return (t1, i1, i2, i3, i4, i5, i6) -> this.test(t1);
    }

    default public <I1, I2, I3, I4, I5, I6, I7> Pr8<I1, I2, I3, I4, I5, I6, I7, T1> ignoring7Lt() {
        return (i1, i2, i3, i4, i5, i6, i7, t1) -> this.test(t1);
    }

    default public <I1, I2, I3, I4, I5, I6, I7> Pr8<T1, I1, I2, I3, I4, I5, I6, I7> ignoring7Rt() {
        return (t1, i1, i2, i3, i4, i5, i6, i7) -> this.test(t1);
    }

    default public Pr1<T1> memoized() {
        return Function1.super.memoized()::apply;
    }

}
