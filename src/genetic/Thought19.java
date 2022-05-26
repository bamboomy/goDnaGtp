package genetic;
import java.util.ArrayList;
class Thought19 extends Thought{
private static ArrayList<Thought19> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = true;
private double fd0 = 460.9079253210047;
private double fd1 = 229.90340194825265;
private Thought fo0 = null;
private Thought fo1 = null;
Thought19 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought19 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought19 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought19 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought19 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought19 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought19 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought19 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
fd0 = ad1; 
fd1 = ad2; 
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
public static Thought19 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought19 instance = new Thought19 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought19 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought19 instance = new Thought19 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought19 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought19 instance = new Thought19 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought19 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought19 instance = new Thought19 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought19 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought19 instance = new Thought19 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought19 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought19 instance = new Thought19 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought19 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought19 instance = new Thought19 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought19 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought19 instance = new Thought19 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
void m1() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
        fb0 = fd1 < fd0;
    boolean lb0 = false;
    Thought lo1 = Thought18.getInstance();
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fb1, lb0, fb0, fb1);
}
    boolean lb2 = true;
        lb0 = fd1 > fd0;
    boolean lb3 = false;
    lb2 = !lb3;
    boolean lb4 = false;
    fd1 *= -1;
if(fo0 != null){
      fd0 = fo0.m3(lb4, fb0, fb1, lb0);
}
    lb2 = !lb3;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
    Output.points[0][6] -= fd1;
    lb4 = fd0 < fd1;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1);
}
    fb1 = lb0 && lb2;
    Thought lo5 = Thought18.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, lb3, lb4, fb0, fb1);
    double ld6 = 102.47637705270049;
    ld6 *= -1;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
    fd1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
    Output.points[0][7] += fd0;
    fb0 = fb1 || ab1;
    Thought lo0 = Thought1.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
    fd1 *= -1;
    boolean lb1 = true;
    fd0 *= -1;
    ab1 = ab2 || ab3;
    Thought lo2 = Thought6.getInstance();
    ab4 = fd1 < fd0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, lb1, ab1);
}

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
    ad1 = ad2 - ad3;
if(fo1 != null){
      fb0 = fo1.m2(fb1, fb0, fb1, fb0);
}
    Output.points[0][8] += ad4;
    fb1 = fd0 > fd1;
    fb0 = ad1 > ad2;
    ad3 = ad4 - fd0;
    fb1 = fd1 < ad1;
    ad2 = ad3 + ad4;
    boolean lb0 = true;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ad1, ad2);
}
    lb0 = ad3 < ad4;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0);
}
    boolean lb1 = true;
    Thought lo2 = Thought17.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2, lb1, fb0, fb1, lb0);
    lb1 = !fb0;
if(fo0 != null){
      fo1 = fo0.m4(ad3, ad4, fd0, fd1, fb1, lb0, lb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    fd0 = fd1 - ad1;
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, lb0, lb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(lb0, lb1, fb0, fb1);
}
    ad2 *= -1;
    if (lb0) {
        Output.points[1][0] += ad3;
        boolean lb3 = false;
        Thought lo4 = Thought2.getInstance(ad4, fd0, fd1, ad1);
}
Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
    boolean lb0 = false;
    boolean lb1 = true;
    ad2 *= -1;
if(fo0 != null){
      lb1 = fo0.m2(fo1, fo0, fo1, fo0);
}
    ad3 = ad4 + fd0;
    fd1 *= -1;
    Output.points[1][1] += ad1;
    ab1 = ad2 > ad3;
if(fo1 != null){
      ab2 = fo1.m2(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      ad2 = fo0.m3(ad3, ad4, fd0, fd1, lb0, lb1, ab1, ab2);
}

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
}
if(ao2 != null){
      fb0 = ao2.m2();
}
    fd0 = fd1 + fd0;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb1, fb0, fb1, fb0);
}
    fd1 = fd0 + fd1;
    Output.points[1][2] += fd0;
    double ld0 = 576.3163404895691;
    double ld1 = 453.2305970151597;
if(ao3 != null){
      ao3.m1(fb1, fb0, fb1, fb0);
}
    ld1 = fd0 + fd1;
if(ao4 != null){
      ld0 = ao4.m3(ld1, fd0, fd1, ld0);
}
    fb1 = !fb0;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    ad2 = ad3 + ad4;
    Thought lo0 = Thought7.getInstance(ao1, ao2, ao3, ao4, fd0, fd1, ad1, ad2, fb1, fb0, fb1, fb0);
    fb1 = !fb0;
if(fo1 != null){
      fo0 = fo1.m4(ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4);
}
    Output.points[1][3] -= fd0;
    fb1 = fd1 > ad1;
    boolean lb1 = false;
if(ao2 != null){
      ao1 = ao2.m4();
}
    ad2 *= -1;
if(ao3 != null){
          ad3 = ao3.m3(ao4, fo0, fo1, ao1, lb1, fb0, fb1, lb1);
}
if(ao3 != null){
      ao2 = ao3.m4(fb0, fb1, lb1, fb0);
}
    ad4 = fd0 + fd1;
    double ld2 = 480.83308860635134;
if(ao4 != null){
      ao4.m2(ld2, ad1, ad2, ad3);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ad4, fd0, fd1, ld2, fb1, lb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4, lb1, fb0, fb1, lb1);
}
    fb0 = fd0 < fd1;
    ld2 = ad1 + ad2;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
    fd1 = fd0 - fd1;
    double ld0 = 359.13976971845057;
        Thought lo1 = Thought17.getInstance(ao1, ao2, ao3, ao4, ld0, fd0, fd1, ld0);
    ab1 = fd0 > fd1;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ab2, ab3, ab4, fb0);
}
if(ao1 != null){
      ao1.m2(fb1, ab1, ab2, ab3);
}
if(ao2 != null){
      ao2.m2(ld0, fd0, fd1, ld0);
}
    fd0 = fd1 + ld0;
    fd0 *= -1;
    ab4 = !fb0;
    Output.points[1][4] -= fd1;
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1);
}
    ld0 = fd0 + fd1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ld0, fd0, fd1, ld0, fb1, ab1, ab2, ab3);
}

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
    ad2 = ad3 - ad4;
if(ao2 != null){
      fd0 = ao2.m3(fd1, ad1, ad2, ad3, ab2, ab3, ab4, fb0);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad4, fd0, fd1, ad1);
}
    boolean lb0 = false;
    ad2 = ad3 + ad4;
if(ao3 != null){
      fb0 = ao3.m2();
}
if(ao4 != null){
      fd0 = ao4.m3(fo0, fo1, ao1, ao2, fb1, lb0, ab1, ab2);
}
    for(int i0=0; i0<10; i0++){
        Output.points[1][5] -= fd1;
        Thought lo1 = Thought8.getInstance(ab3, ab4, fb0, fb1);
}
Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
boolean m2() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if(fo0 != null){
      fo0.m3(fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo1.m1(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fd1 = fo1.m3();
}
    fd0 = fd1 + fd0;
    fd1 = fd0 + fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
    Thought lo0 = Thought3.getInstance(fb0, fb1, fb0, fb1);
if(fo0 != null){
      fd0 = fo0.m3(fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1);
}

Thought.STACK_COUNTER++;
return fb0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
    fd1 *= -1;
    fb1 = ab1 || ab2;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fd0 = fo0.m3();
}
    ab1 = fd1 < fd0;
    ab2 = ab3 || ab4;
    for(int i0=0; i0<10; i0++){
        double ld0 = 808.9702326515343;
        boolean lb1 = false;
        Thought lo2 = Thought10.getInstance(fo1, fo0, fo1, fo0, ab4, fb0, fb1, lb1);
if(fo0 != null){
          fo1 = fo0.m4(ab1, ab2, ab3, ab4);
}
}
Thought.STACK_COUNTER++;
return fb1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if(fo0 != null){
      fo1 = fo0.m4(ad2, ad3, ad4, fd0);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1);
}
    Thought lo0 = Thought17.getInstance(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
    fb0 = ad4 > fd0;
    boolean lb1 = true;
    fb0 = !fb1;
    lb1 = fb0 && fb1;
if(fo0 != null){
      fo0.m3(fd1, ad1, ad2, ad3, lb1, fb0, fb1, lb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1);
}
    boolean lb2 = true;
    ad2 = ad3 + ad4;
if(fo1 != null){
      lb2 = fo1.m2();
}
    fb0 = fd0 < fd1;
    Thought lo3 = Thought12.getInstance(fo0, fo1, fo0, fo1, fb1, lb1, lb2, fb0);
    Thought lo4 = Thought14.getInstance(fb1, lb1, lb2, fb0);
if(fo0 != null){
      fb1 = fo0.m2(ad1, ad2, ad3, ad4);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1);
}
    lb1 = fd0 > fd1;
    Thought lo5 = Thought10.getInstance(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, lb2, fb0, fb1, lb1);
    fd0 *= -1;
if(fo0 != null){
      fo0.m1(fd1, ad1, ad2, ad3, lb2, fb0, fb1, lb1);
}
if(fo1 != null){
      ad4 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2);
}

Thought.STACK_COUNTER++;
return lb2;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
    Output.points[1][6] += ad1;
    for(int i0=0; i0<10; i0++){
        boolean lb0 = true;
        lb0 = ad2 > ad3;
if(fo1 != null){
          fo0 = fo1.m4();
}
        ab1 = ad4 > fd0;
if(fo0 != null){
          ab2 = fo0.m2(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
          fo1 = fo0.m4(lb0, ab1, ab2, ab3);
}
if(fo1 != null){
          fo1.m3(fd1, ad1, ad2, ad3);
}
if(fo0 != null){
          ad4 = fo0.m3(fo1, fo0, fo1, fo0);
}
        ab4 = fd0 > fd1;
        ad1 = ad2 + ad3;
        fb0 = fb1 && lb0;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1, ab1, ab2, ab3, ab4);
}
        boolean lb1 = false;
if(fo1 != null){
          fo1.m3(ad2, ad3, ad4, fd0, ab4, fb0, fb1, lb0);
}
        lb1 = ab1 && ab2;
        ab3 = ab4 && fb0;
if(fo0 != null){
          fb1 = fo0.m2(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3);
}
        lb0 = !lb1;
if(fo0 != null){
          fo1 = fo0.m4();
}
        ad4 *= -1;
        ab1 = fd0 < fd1;
        ab2 = ad1 < ad2;
        ad3 = ad4 + fd0;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
          fo1 = fo0.m4(lb0, lb1, ab1, ab2);
}
if(fo1 != null){
          fd1 = fo1.m3(ad1, ad2, ad3, ad4);
}
        ab3 = ab4 && fb0;
}
Thought.STACK_COUNTER++;
return ab2;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
    fd0 = fd1 - fd0;
    boolean lb0 = true;
    boolean lb1 = true;
    fd1 = fd0 + fd1;
    if (lb0) {
        Thought lo2 = Thought19.getInstance(ao1, ao2, ao3, ao4);
        fd0 = fd1 + fd0;
if(fo1 != null){
          fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0, lb1, fb0, fb1, lb0);
}
        double ld3 = 929.998022562835;
if(fo1 != null){
          fo0 = fo1.m4(fd0, fd1, ld3, fd0, lb1, fb0, fb1, lb0);
}
        fd1 = ld3 + fd0;
        lb1 = fd1 < ld3;
if(ao1 != null){
          fb0 = ao1.m2(ao2, ao3, ao4, fo0, fd0, fd1, ld3, fd0);
}
        fd1 = ld3 - fd0;
if(fo1 != null){
          fb1 = fo1.m2();
}
        lb0 = fd1 < ld3;
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, lb1, fb0, fb1, lb0);
}
        boolean lb4 = true;
        fd0 = fd1 - ld3;
        double ld5 = 725.2583645832354;
        lb0 = lb1 && fb0;
        ld5 = fd0 + fd1;
        fb1 = lb4 && lb0;
        lb1 = fb0 && fb1;
        Output.points[1][7] += ld3;
        lb4 = !lb0;
}
Thought.STACK_COUNTER++;
return fb0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if(ao1 != null){
      ad2 = ao1.m3(fb1, fb0, fb1, fb0);
}
    fb1 = ad3 < ad4;
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, ad1, ad2);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
    double ld0 = 919.0040433113353;
    fb0 = !fb1;
    Output.points[1][8] += ad2;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fb0 = ld0 > ad1;
    Output.points[2][0] -= ad2;
if(fo0 != null){
      ao4 = fo0.m4(ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
}
    boolean lb1 = true;
if(fo1 != null){
      fo1.m2(ao1, ao2, ao3, ao4, ld0, ad1, ad2, ad3);
}
    fb0 = ad4 > fd0;
        fd1 = ld0 - ad1;
if(fo0 != null){
      ad2 = fo0.m3();
}
    ad3 = ad4 - fd0;
    Output.points[2][1] -= fd1;
if(fo1 != null){
      fo1.m1(ao1, ao2, ao3, ao4, fb1, lb1, fb0, fb1);
}
    boolean lb2 = false;
if(fo1 != null){
      fo0 = fo1.m4(lb1, lb2, fb0, fb1);
}
    lb1 = !lb2;
if(ao2 != null){
      ao1 = ao2.m4(ld0, ad1, ad2, ad3);
}
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1);
}

Thought.STACK_COUNTER++;
return fb0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
    ab2 = ab3 || ab4;
    fb0 = fb1 && ab1;
    double ld0 = 584.4052311023773;
    boolean lb1 = false;
    ab1 = ld0 > fd0;
    fd1 = ld0 - fd0;
    ab2 = fd1 > ld0;
    boolean lb2 = false;
if(ao2 != null){
      ab2 = ao2.m2(ao3, ao4, fo0, fo1, fd0, fd1, ld0, fd0, ab3, ab4, fb0, fb1);
}
    boolean lb3 = true;
    Output.points[2][2] += fd1;
if(ao2 != null){
      ao1 = ao2.m4(ld0, fd0, fd1, ld0, lb1, lb2, lb3, ab1);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, ld0, fd0);
}
    boolean lb4 = false;
    boolean lb5 = false;
if(ao4 != null){
      ao3 = ao4.m4();
}
    lb5 = fd1 > ld0;
    Output.points[2][3] += fd0;
    fd1 = ld0 - fd0;

Thought.STACK_COUNTER++;
return ab1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
    ab1 = ab2 || ab3;
    ab4 = ad1 > ad2;
if(ao1 != null){
      fb0 = ao1.m2(ao2, ao3, ao4, fo0, fb1, ab1, ab2, ab3);
}
if(fo1 != null){
      fo1.m3(ab4, fb0, fb1, ab1);
}
    ab2 = ad3 > ad4;
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, ad1, ad2);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
    ab3 = ab4 && fb0;
    ad3 *= -1;
    fb1 = !ab1;
    ab2 = ab3 || ab4;

Thought.STACK_COUNTER++;
return fb0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
    fd1 = fd0 + fd1;
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
if(fo1 != null){
      fb1 = fo1.m2(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
    fb1 = fd0 < fd1;
    fb0 = fb1 && fb0;
    Output.points[2][4] -= fd0;
    Thought lo0 = Thought7.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
    boolean lb1 = true;
    boolean lb2 = false;
    boolean lb3 = false;
if(fo0 != null){
      fo0.m2();
}
    Thought lo4 = Thought6.getInstance(fo1, fo0, fo1, fo0, lb2, lb3, fb0, fb1);
    double ld5 = 515.0850872630197;
    fd0 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(lb1, lb2, lb3, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd1, ld5, fd0, fd1);
}

Thought.STACK_COUNTER++;
return ld5;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
    ab1 = fd1 < fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fd1 = fd0 - fd1;
    fd0 = fd1 + fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
    fd1 = fd0 + fd1;
if(fo1 != null){
      fb1 = fo1.m2(fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
    boolean lb0 = true;
    boolean lb1 = true;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    ab3 = ab4 && fb0;
if(fo0 != null){
      fo1 = fo0.m4();
}
    Thought lo2 = Thought7.getInstance(fo1, fo0, fo1, fo0, fb1, lb0, lb1, ab1);

Thought.STACK_COUNTER++;
return fd1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if(fo1 != null){
      fo1.m1(fb1, fb0, fb1, fb0);
}
        ad1 *= -1;
    ad2 *= -1;
    Output.points[2][5] -= ad3;
    ad4 = fd0 - fd1;
    boolean lb0 = true;
if(fo0 != null){
      fo0.m2(ad1, ad2, ad3, ad4);
}
    Thought lo1 = Thought12.getInstance(fo1, fo0, fo1, fo0);
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3, fb0, fb1, lb0, fb0);
}
if(fo0 != null){
      fo0.m1(ad4, fd0, fd1, ad1, fb1, lb0, fb0, fb1);
}

Thought.STACK_COUNTER++;
return ad2;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
    ad1 = ad2 - ad3;
    ad4 = fd0 + fd1;
    ab1 = ab2 || ab3;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
}
if(fo1 != null){
      fo1.m3();
}
    Thought lo0 = Thought4.getInstance(fo0, fo1, fo0, fo1, ab4, fb0, fb1, ab1);
    boolean lb1 = false;
    boolean lb2 = false;
if(fo0 != null){
      fd0 = fo0.m3(lb2, ab1, ab2, ab3);
}
    fd1 = ad1 + ad2;
    boolean lb3 = false;
    ad3 *= -1;

Thought.STACK_COUNTER++;
return ad4;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
    fb1 = fd0 > fd1;
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, fd0, fd1);
}
    fd0 = fd1 + fd0;
    boolean lb0 = true;
    Thought lo1 = Thought3.getInstance(ao4, fo0, fo1, ao1);
    fd1 = fd0 + fd1;
    lb0 = fb0 && fb1;
    Thought lo2 = Thought18.getInstance(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1, lb0, fb0, fb1, lb0);
if(fo1 != null){
      fo1.m1(fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
}
    fd0 *= -1;
    boolean lb3 = true;
    fb0 = fd1 > fd0;
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0);
}
    boolean lb4 = true;
    boolean lb5 = true;
        fd1 = fd0 + fd1;
    fd0 = fd1 - fd0;
    Thought lo6 = Thought14.getInstance();
    fd1 = fd0 + fd1;
if(fo1 != null){
      fd0 = fo1.m3(ao1, ao2, ao3, ao4, lb5, fb0, fb1, lb0);
}
    boolean lb7 = false;
    Thought lo8 = Thought4.getInstance(lb3, lb4, lb5, lb7);
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}

Thought.STACK_COUNTER++;
return fd1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
    boolean lb0 = false;
    double ld1 = 546.4244904434913;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    boolean lb2 = false;
    boolean lb3 = true;
    Output.points[2][6] += ld1;
    Thought lo4 = Thought8.getInstance(ao1, ao2, ao3, ao4, ad1, ad2, ad3, ad4, lb2, lb3, fb0, fb1);
    lb0 = lb2 || lb3;
if(fo0 != null){
      fo0.m1(fd0, fd1, ld1, ad1, fb0, fb1, lb0, lb2);
}
    double ld5 = 47.08709805921791;
    lb3 = !fb0;
    double ld6 = 3.752936088025148;

Thought.STACK_COUNTER++;
return ld6;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
}
    boolean lb0 = false;
    fd1 = fd0 + fd1;
if(ao3 != null){
      ao2 = ao3.m4();
}
    lb0 = fd0 > fd1;
    boolean lb1 = false;
    lb1 = ab1 || ab2;
    fd0 = fd1 + fd0;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ab3, ab4, fb0, fb1);
}
    fd1 *= -1;
if(fo0 != null){
      ao4 = fo0.m4(lb0, lb1, ab1, ab2);
}
if(ao1 != null){
      fo1 = ao1.m4(fd0, fd1, fd0, fd1);
}
if(ao2 != null){
      ab3 = ao2.m2(ao3, ao4, fo0, fo1);
}
    ab4 = fd0 < fd1;
    boolean lb2 = false;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, ab4, fb0, fb1, lb0);
}
    Thought lo3 = Thought12.getInstance(fd0, fd1, fd0, fd1, lb1, lb2, ab1, ab2);
    Thought lo4 = Thought14.getInstance(ao1, ao2, ao3, ao4, fd0, fd1, fd0, fd1);

Thought.STACK_COUNTER++;
return fd0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
        ab2 = !ab3;
    ab4 = ad2 < ad3;
if(ao2 != null){
      ao1 = ao2.m4();
}
    Thought lo0 = Thought9.getInstance(ao3, ao4, fo0, fo1, fb0, fb1, ab1, ab2);
    boolean lb1 = true;
    ad4 = fd0 + fd1;
if(ao1 != null){
          ao1.m2(ab2, ab3, ab4, fb0);
}
    boolean lb2 = true;
    ad1 *= -1;
if(ao2 != null){
      fb0 = ao2.m2(ad2, ad3, ad4, fd0);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
    Thought lo3 = Thought18.getInstance(ao3, ao4, fo0, fo1, fd1, ad1, ad2, ad3, fb1, lb1, lb2, ab1);
    ab2 = !ab3;
    ad4 = fd0 + fd1;
    ad1 = ad2 + ad3;
    Thought lo4 = Thought16.getInstance(ad4, fd0, fd1, ad1, ab4, fb0, fb1, lb1);
    Thought lo5 = Thought0.getInstance(ao1, ao2, ao3, ao4, ad2, ad3, ad4, fd0);
    lb2 = ab1 && ab2;
    fd1 = ad1 - ad2;
    Thought lo6 = Thought14.getInstance();
if(fo0 != null){
      ad3 = fo0.m3(fo1, ao1, ao2, ao3, ab3, ab4, fb0, fb1);
}
    lb1 = ad4 < fd0;
    fd1 *= -1;
if(ao4 != null){
      ad1 = ao4.m3(lb2, ab1, ab2, ab3);
}
if(fo0 != null){
      fo0.m1(ad2, ad3, ad4, fd0);
}

Thought.STACK_COUNTER++;
return fd1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fd0 = fd1 - fd0;
    Thought lo0 = Thought5.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
        if (fb1) {
        Thought lo1 = Thought13.getInstance(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
        fb0 = !fb1;
        fb0 = !fb1;
        fb0 = !fb1;
}
Thought.STACK_COUNTER++;
return fo1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
    double ld0 = 691.6416779297512;
    boolean lb1 = false;
if(fo0 != null){
      lb1 = fo0.m2();
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
    fd0 = fd1 - ld0;
if(fo1 != null){
      fd0 = fo1.m3(fb0, fb1, lb1, ab1);
}
    fd1 = ld0 - fd0;
    double ld2 = 399.8709521528358;
if(fo0 != null){
      fo0.m1(fd0, fd1, ld0, ld2);
}
    ab2 = ab3 && ab4;
    if (fb0) {
if(fo1 != null){
          fo1.m2(fo0, fo1, fo0, fo1);
}
        fb1 = lb1 && ab1;
        ab2 = ab3 && ab4;
if(fo0 != null){
          fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, ld0, ld2, fd0, fb0, fb1, lb1, ab1);
}
        ab2 = fd1 < ld0;
if(fo1 != null){
          ld2 = fo1.m3(fd0, fd1, ld0, ld2, ab3, ab4, fb0, fb1);
}
        lb1 = ab1 && ab2;
        ab3 = ab4 || fb0;
if(fo0 != null){
          fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, ld0, ld2);
}
        fb1 = lb1 || ab1;
if(fo1 != null){
          ab2 = fo1.m2();
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
          fo0.m2(lb1, ab1, ab2, ab3);
}
        Thought lo3 = Thought12.getInstance(fd0, fd1, ld0, ld2);
        Thought lo4 = Thought16.getInstance(fo1, fo0, fo1, fo0);
        ab4 = fb0 && fb1;
        lb1 = ab1 || ab2;
}
Thought.STACK_COUNTER++;
return fo1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ad1, ad2, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
    boolean lb0 = true;
if(fo0 != null){
      ad3 = fo0.m3(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1);
}
    for(int i0=0; i0<10; i0++){
        Output.points[2][7] += ad2;
        ad3 = ad4 - fd0;
if(fo1 != null){
          fo1.m1();
}
if(fo0 != null){
          fd1 = fo0.m3(fo1, fo0, fo1, fo0, lb0, fb0, fb1, lb0);
}
        fb0 = fb1 || lb0;
if(fo0 != null){
          fo1 = fo0.m4(fb0, fb1, lb0, fb0);
}
if(fo1 != null){
          fo1.m2(ad1, ad2, ad3, ad4);
}
        Thought lo1 = Thought16.getInstance(fo0, fo1, fo0, fo1);
        Thought lo2 = Thought11.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2, fb1, lb0, fb0, fb1);
        lb0 = fb0 && fb1;
        lb0 = ad3 < ad4;
if(fo1 != null){
          fo0 = fo1.m4(fd0, fd1, ad1, ad2, fb0, fb1, lb0, fb0);
}
if(fo0 != null){
          fb1 = fo0.m2(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
}
        lb0 = fb0 || fb1;
        Thought lo3 = Thought14.getInstance();
        lb0 = fb0 || fb1;
if(fo1 != null){
          ad1 = fo1.m3(fo0, fo1, fo0, fo1, lb0, fb0, fb1, lb0);
}
        fb0 = ad2 < ad3;
}
Thought.STACK_COUNTER++;
return fo0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
    ad2 = ad3 - ad4;
    Thought lo0 = Thought3.getInstance(ab1, ab2, ab3, ab4);
if(fo1 != null){
      fd0 = fo1.m3(fd1, ad1, ad2, ad3);
}
    fb0 = !fb1;
    ab1 = !ab2;
    ab3 = ad4 < fd0;
    Thought lo1 = Thought12.getInstance(fo0, fo1, fo0, fo1);
    fd1 *= -1;
    double ld2 = 276.4838266192923;
    for(int i0=0; i0<10; i0++){
        ld2 = ad1 + ad2;
        ab4 = !fb0;
        fb1 = ab1 || ab2;
        Output.points[2][8] += ad3;
        Thought lo3 = Thought5.getInstance(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ld2, ab3, ab4, fb0, fb1);
        if (ab1) {
            for(int i1=0; i1<10; i1++){
                ad1 *= -1;
                for(int i2=0; i2<10; i2++){
}}}}
Thought.STACK_COUNTER++;
return fo0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if(ao2 != null){
      ao2.m3(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fb1 = fd0 > fd1;
    fb0 = fb1 && fb0;
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
}
    fb1 = !fb0;
    fd0 = fd1 - fd0;
    Thought lo0 = Thought10.getInstance();
    fd1 *= -1;
    fd0 = fd1 + fd0;
    boolean lb1 = true;
    Thought lo2 = Thought16.getInstance(ao2, ao3, ao4, fo0, fb0, fb1, lb1, fb0);
    fb1 = fd1 < fd0;
if(fo1 != null){
      fd1 = fo1.m3(lb1, fb0, fb1, lb1);
}
    Thought lo3 = Thought16.getInstance(fd0, fd1, fd0, fd1);
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, lb1, fb0);
}

Thought.STACK_COUNTER++;
return ao1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
    ad1 *= -1;
if(ao2 != null){
      ad2 = ao2.m3(ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad1, ad2, ad3, ad4);
}
    if (fb0) {
        fd0 = fd1 + ad1;
        fb1 = !fb0;
        fb1 = ad2 > ad3;
        } else {
if(ao4 != null){
          ao3 = ao4.m4();
}
        boolean lb0 = false;
        ad4 = fd0 - fd1;
}
Thought.STACK_COUNTER++;
return fo0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
    fd0 = fd1 + fd0;
if(ao2 != null){
          fd1 = ao2.m3(ao3, ao4, fo0, fo1, ab1, ab2, ab3, ab4);
}
if(ao2 != null){
      ao1 = ao2.m4(fb0, fb1, ab1, ab2);
}
if(ao3 != null){
      fd0 = ao3.m3(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
    fd1 *= -1;
    fd0 *= -1;
if(ao4 != null){
          ab3 = ao4.m2(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0, ab4, fb0, fb1, ab1);
}
    ab2 = ab3 || ab4;
if(ao4 != null){
      ao3 = ao4.m4(fd1, fd0, fd1, fd0, fb0, fb1, ab1, ab2);
}
        Thought lo0 = Thought7.getInstance(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0);
if(ao3 != null){
      ab3 = ao3.m2();
}
    boolean lb1 = true;
    double ld2 = 165.79062861808887;
    ab3 = !ab4;
if(ao4 != null){
      fd0 = ao4.m3(fo0, fo1, ao1, ao2, fb0, fb1, lb1, ab1);
}
if(ao3 != null){
      ao3.m2(ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      ao4 = fo0.m4(fd1, ld2, fd0, fd1);
}
    fb1 = !lb1;

Thought.STACK_COUNTER++;
return fo1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
    ad1 = ad2 - ad3;
    Output.points[3][0] += ad4;
    ab2 = ab3 || ab4;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    if (fb0) {
        boolean lb0 = true;
        Output.points[3][1] += fd0;
        fb0 = fd1 < ad1;
        boolean lb1 = true;
        fb0 = !fb1;
        ad2 = ad3 + ad4;
if(ao1 != null){
          fd0 = ao1.m3(ao2, ao3, ao4, fo0, fd1, ad1, ad2, ad3, lb0, lb1, ab1, ab2);
}
        for(int i0=0; i0<10; i0++){
            ab3 = ab4 || fb0;
}}
Thought.STACK_COUNTER++;
return fo1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
void accept(String color) throws CountDownExc {
switch (color) {
case "e":
empty();
break;
case "own":
own();
break;
case "other":
other();
break;
default:
throw new RuntimeException("Illegal color!!!");
}
}
void empty() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
    Thought lo0 = Thought16.getInstance(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
    fb1 = !fb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    fd1 = fd0 + fd1;
    fb1 = fb0 && fb1;
    boolean lb1 = true;
    Thought lo2 = Thought10.getInstance();
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, lb1, fb0, fb1, lb1);
}
    Output.points[3][2] -= fd0;
    fb0 = fb1 || lb1;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void own() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if(fo1 != null){
      fo1.m1(fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
    fb1 = fd1 < fd0;
    fd1 = fd0 - fd1;
        fb0 = fb1 && fb0;
            fd0 *= -1;
    fd1 = fd0 - fd1;
if(fo0 != null){
          fb1 = fo0.m2(fo1, fo0, fo1, fo0);
}
    fd0 *= -1;
    fd1 *= -1;
    fd0 = fd1 - fd0;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo0.m2(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void other() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fd1 = fo0.m3();
}
    double ld0 = 258.8529765007259;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    fb0 = ld0 > fd0;
    boolean lb1 = true;
if(fo0 != null){
      fo0.m2(fb0, fb1, lb1, fb0);
}
    fd1 = ld0 + fd0;
    fd1 *= -1;
    Thought lo2 = Thought17.getInstance(ld0, fd0, fd1, ld0);
    fd0 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
}
