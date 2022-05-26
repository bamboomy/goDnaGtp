package genetic;
import java.util.ArrayList;
class Thought13 extends Thought{
private static ArrayList<Thought13> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = true;
private double fd0 = 783.7530101031105;
private double fd1 = 528.0552187546442;
private Thought fo0 = null;
private Thought fo1 = null;
Thought13 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought13 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought13 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought13 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought13 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought13 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought13 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought13 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought13 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought13 instance = new Thought13 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought13 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought13 instance = new Thought13 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought13 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought13 instance = new Thought13 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought13 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought13 instance = new Thought13 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought13 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought13 instance = new Thought13 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought13 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought13 instance = new Thought13 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought13 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought13 instance = new Thought13 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought13 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought13 instance = new Thought13 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fd1 = fd0 + fd1;
    fb1 = fb0 && fb1;
    double ld0 = 479.42704867191765;
    Thought lo1 = Thought16.getInstance(fo1, fo0, fo1, fo0, ld0, fd0, fd1, ld0);
if(fo1 != null){
      fo1.m3();
}
    fb0 = fd0 > fd1;
    Thought lo2 = Thought7.getInstance(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
    boolean lb3 = true;
    Thought lo4 = Thought6.getInstance(fb0, fb1, lb3, fb0);
    boolean lb5 = true;
    fb0 = ld0 < fd0;
    boolean lb6 = false;
    fb0 = fb1 || lb3;
    Thought lo7 = Thought13.getInstance(fd1, ld0, fd0, fd1);
    boolean lb8 = true;
if(fo0 != null){
      ld0 = fo0.m3(fo1, fo0, fo1, fo0);
}
    double ld9 = 853.7392243992446;
    lb5 = ld9 < fd0;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd1, ld0, ld9, fd0, lb6, lb8, fb0, fb1);
}
    lb3 = !lb5;
if(fo0 != null){
      fd1 = fo0.m3(ld0, ld9, fd0, fd1, lb6, lb8, fb0, fb1);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, ld0, ld9, fd0, fd1);
}
    lb3 = lb5 || lb6;
if(fo1 != null){
      fo0 = fo1.m4();
}
    lb8 = ld0 < ld9;
    Output.points[6][5] -= fd0;
    Thought lo10 = Thought16.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, lb3, lb5);
if(fo0 != null){
      fd1 = fo0.m3(lb6, lb8, fb0, fb1);
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
void m1(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
    boolean lb0 = false;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
    fd0 = fd1 - fd0;
if(fo1 != null){
      lb0 = fo1.m2(fo0, fo1, fo0, fo1);
}
    boolean lb1 = false;
    lb1 = fd1 > fd0;
    boolean lb2 = false;
    lb2 = fd1 > fd0;
    ab1 = fd1 < fd0;
    fd1 = fd0 + fd1;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0, fb1, lb0, lb1, lb2);
}
    ab1 = ab2 || ab3;
    for(int i0=0; i0<10; i0++){
        ab4 = fd1 < fd0;
        fb0 = fd1 < fd0;
        fd1 = fd0 + fd1;
        Thought lo3 = Thought2.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
        for(int i1=0; i1<10; i1++){
            fb1 = !lb0;
            fd0 = fd1 - fd0;
            lb1 = lb2 || ab1;
            fd1 *= -1;
}}
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
    boolean lb0 = true;
if(fo0 != null){
      fo0.m3();
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb0, fb0, fb1, lb0);
}
    fb0 = ad1 < ad2;
    boolean lb1 = false;
    boolean lb2 = true;
    lb2 = ad3 > ad4;
    fb0 = fd0 < fd1;
    fb1 = lb0 && lb1;
    lb2 = fb0 && fb1;
    lb0 = lb1 && lb2;

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
    ab2 = ad1 > ad2;
    ab3 = ad3 < ad4;
    fd0 = fd1 - ad1;
    ab4 = ad2 < ad3;
    Output.points[6][6] += ad4;
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fd0 = fo1.m3(fb0, fb1, ab1, ab2);
}
        ab3 = ab4 && fb0;
        fd1 = ad1 + ad2;
if(fo1 != null){
          fo0 = fo1.m4(ad3, ad4, fd0, fd1);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
        fb1 = ab1 || ab2;
        ad1 *= -1;
if(fo0 != null){
          ad2 = fo0.m3(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, ab3, ab4, fb0, fb1);
}
        Thought lo0 = Thought2.getInstance(ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
if(fo1 != null){
          fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2);
}
if(fo0 != null){
          ad3 = fo0.m3();
}
        Output.points[6][7] -= ad4;
if(fo1 != null){
          fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, ab1, ab2);
}
        Thought lo1 = Thought0.getInstance(ab3, ab4, fb0, fb1);
if(fo0 != null){
          fd0 = fo0.m3(fd1, ad1, ad2, ad3);
}
if(fo1 != null){
          fo1.m2(fo0, fo1, fo0, fo1);
}
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
    Thought lo0 = Thought17.getInstance(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
if(fo0 != null){
      fo0.m1(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fd1 = fo1.m3(ao1, ao2, ao3, ao4, fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0, fb0, fb1, fb0, fb1);
}
    boolean lb1 = true;
    Thought lo2 = Thought7.getInstance(lb1, fb0, fb1, lb1);
    fd0 *= -1;
    fb0 = !fb1;
    fd1 = fd0 + fd1;
        lb1 = fd0 < fd1;
    fd0 = fd1 + fd0;
if(fo1 != null){
      fb0 = fo1.m2(fd1, fd0, fd1, fd0);
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0);
}
if(fo1 != null){
      ad2 = fo1.m3(ao1, ao2, ao3, ao4, ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
}
    boolean lb0 = false;
    lb0 = ad1 < ad2;
if(fo0 != null){
      fo0.m1(ad3, ad4, fd0, fd1, fb0, fb1, lb0, fb0);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4);
}
if(ao1 != null){
      fo1 = ao1.m4();
}
        Output.points[6][8] += fd0;
    Output.points[7][0] -= fd1;
    ad1 *= -1;
    Thought lo1 = Thought16.getInstance(ao2, ao3, ao4, fo0, fb1, lb0, fb0, fb1);
    ad2 *= -1;
    boolean lb2 = true;
    lb0 = !lb2;
    double ld3 = 813.7412594276526;
    ad2 *= -1;
if(fo1 != null){
          fo1.m3(fb0, fb1, lb0, lb2);
}
    Thought lo4 = Thought12.getInstance(ad3, ad4, fd0, fd1);
    fb0 = !fb1;
    ld3 = ad1 + ad2;
    ad3 = ad4 + fd0;
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0);
}
    lb0 = fd1 < ld3;
    ad1 = ad2 + ad3;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ad4, fd0, fd1, ld3, lb2, fb0, fb1, lb0);
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
    Thought lo0 = Thought3.getInstance(fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
    boolean lb1 = false;
    fb0 = !fb1;
    fd1 *= -1;
    boolean lb2 = true;
    lb1 = fd0 > fd1;
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
    lb2 = fd0 < fd1;
    double ld3 = 11.566444070115438;
    ab1 = ab2 && ab3;
if(ao1 != null){
      ab4 = ao1.m2();
}
    fb0 = ld3 < fd0;
    Output.points[7][1] -= fd1;

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
    double ld0 = 231.64726977198924;
    Thought lo1 = Thought18.getInstance(ao2, ao3, ao4, fo0, ab2, ab3, ab4, fb0);
    Thought lo2 = Thought7.getInstance(fb1, ab1, ab2, ab3);
    ab4 = !fb0;
if(ao1 != null){
      fo1 = ao1.m4(ld0, ad1, ad2, ad3);
}
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ld0, fb1, ab1, ab2, ab3);
}
    ad1 = ad2 - ad3;
    ad4 = fd0 - fd1;
    ab4 = ld0 < ad1;
    Thought lo3 = Thought13.getInstance(ad2, ad3, ad4, fd0, fb0, fb1, ab1, ab2);
    fd1 = ld0 - ad1;
    Thought lo4 = Thought17.getInstance(ao1, ao2, ao3, ao4, ad2, ad3, ad4, fd0);
    fd1 = ld0 - ad1;
    boolean lb5 = false;

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
    double ld0 = 666.288652677577;
    boolean lb1 = false;
if(fo1 != null){
      fo0 = fo1.m4();
}
    double ld2 = 358.7891561342172;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb1, fb0, fb1, lb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, lb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(ld0, ld2, fd0, fd1);
}
    Output.points[7][2] += ld0;
    double ld3 = 77.54743531646139;
    Thought lo4 = Thought2.getInstance(fo0, fo1, fo0, fo1);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld2, ld3, fd0, fd1, fb1, lb1, fb0, fb1);
}
    Thought lo5 = Thought19.getInstance(ld0, ld2, ld3, fd0, lb1, fb0, fb1, lb1);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld0, ld2, ld3);
}
    fd0 = fd1 + ld0;
if(fo1 != null){
      fo0 = fo1.m4();
}
    if (fb0) {
        fb1 = lb1 && fb0;
        fb1 = lb1 && fb0;
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
boolean m2(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
    fd1 *= -1;
    fb0 = fd0 < fd1;
    fb1 = fd0 > fd1;
    ab1 = !ab2;
    for(int i0=0; i0<10; i0++){
        boolean lb0 = false;
        double ld1 = 147.5238309318745;
        Thought lo2 = Thought19.getInstance(ab2, ab3, ab4, fb0);
if(fo0 != null){
          fo1 = fo0.m4(ld1, fd0, fd1, ld1);
}
        boolean lb3 = false;
        for(int i1=0; i1<10; i1++){
            fb0 = fb1 && lb0;
if(fo1 != null){
              fo1.m1(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
              fo0.m1(fo1, fo0, fo1, fo0, fd0, fd1, ld1, fd0, lb3, ab1, ab2, ab3);
}
if(fo1 != null){
              fo1.m2(fd1, ld1, fd0, fd1, ab4, fb0, fb1, lb0);
}
if(fo0 != null){
              ld1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ld1, fd0);
}
            lb3 = ab1 || ab2;
            if (ab3) {
                double ld4 = 27.669740444959857;
                Output.points[7][3] -= fd0;
if(fo0 != null){
                  fo1 = fo0.m4();
}
                double ld5 = 135.11971925651355;
if(fo0 != null){
                  fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab4, fb0, fb1, lb0);
}
}}}
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
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
    Output.points[7][4] += ad1;
    ad2 = ad3 + ad4;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ad1, ad2);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    boolean lb0 = true;
    ad3 *= -1;
        ad4 = fd0 + fd1;
    Thought lo1 = Thought17.getInstance(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, lb0, fb0, fb1, lb0);
if(fo1 != null){
      fo1.m2(fd0, fd1, ad1, ad2, fb0, fb1, lb0, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
}
if(fo0 != null){
      ad1 = fo0.m3();
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, lb0, fb0, fb1);
}
    double ld2 = 559.3212490453279;
if(fo1 != null){
      fo1.m1(lb0, fb0, fb1, lb0);
}
    Thought lo3 = Thought17.getInstance(ad1, ad2, ad3, ad4);

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
boolean m2(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
    ab1 = ad2 > ad3;
    ad4 = fd0 + fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    ab2 = ab3 && ab4;
    fb0 = ad1 > ad2;
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, ab1, ab2, ab3, ab4);
}
    double ld0 = 395.36904805880926;
    fb0 = fb1 && ab1;
    Thought lo1 = Thought2.getInstance(ld0, ad1, ad2, ad3, ab2, ab3, ab4, fb0);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ld0);
}
if(fo1 != null){
      fb1 = fo1.m2();
}
    ab1 = ad1 < ad2;
    boolean lb2 = false;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, lb2, ab1);
}
if(fo1 != null){
      fo0 = fo1.m4(ad3, ad4, fd0, fd1);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0);
}
    ab2 = ab3 || ab4;
    double ld3 = 234.1385477563409;
    ld0 = ld3 - ad1;
    boolean lb4 = false;
    ab4 = ad2 > ad3;
    fb0 = fb1 && lb2;
    Output.points[7][5] -= ad4;
    double ld5 = 250.79003370531055;
    lb4 = !ab1;
    Thought lo6 = Thought0.getInstance(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ld0, ab2, ab3, ab4, fb0);

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
    Thought lo0 = Thought10.getInstance(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
    Output.points[7][6] += fd1;
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}
    boolean lb1 = true;
if(ao2 != null){
      ao1 = ao2.m4();
}
    lb1 = fd1 > fd0;
if(ao3 != null){
      fb0 = ao3.m2(ao4, fo0, fo1, ao1, fb1, lb1, fb0, fb1);
}
    boolean lb2 = false;
    Output.points[7][7] -= fd1;
if(ao2 != null){
      lb1 = ao2.m2(lb2, fb0, fb1, lb1);
}
    fd0 = fd1 - fd0;
    Output.points[7][8] -= fd1;
    lb2 = fd0 > fd1;
    if (fb0) {
if(ao3 != null){
          fd0 = ao3.m3(fd1, fd0, fd1, fd0);
}
        double ld3 = 333.7388189363712;
        fd0 *= -1;
        fb1 = fd1 < ld3;
        lb1 = fd0 < fd1;
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
    ad1 *= -1;
    Thought lo0 = Thought14.getInstance(ao2, ao3, ao4, fo0);
    ad2 *= -1;
    Thought lo1 = Thought12.getInstance(fo1, ao1, ao2, ao3, ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
    ad1 = ad2 - ad3;
if(fo0 != null){
      ao4 = fo0.m4(ad4, fd0, fd1, ad1, fb0, fb1, fb0, fb1);
}
    boolean lb2 = false;
if(fo1 != null){
      fo1.m2(ao1, ao2, ao3, ao4, ad2, ad3, ad4, fd0);
}
    fd1 = ad1 - ad2;
    lb2 = fb0 && fb1;
    lb2 = ad3 < ad4;
if(fo1 != null){
      fo0 = fo1.m4();
}
    Thought lo3 = Thought13.getInstance(ao1, ao2, ao3, ao4, fb0, fb1, lb2, fb0);

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if(ao1 != null){
      ao1.m1(ab1, ab2, ab3, ab4);
}
    Thought lo0 = Thought1.getInstance(fd0, fd1, fd0, fd1);
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1, fb0, fb1, ab1, ab2);
}
    Thought lo1 = Thought13.getInstance(fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
    ab1 = ab2 || ab3;
    double ld2 = 51.18740449539994;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ld2, fd0, fd1, ld2);
}
    fd0 = fd1 + ld2;
    fd0 = fd1 + ld2;
if(ao3 != null){
      ao2 = ao3.m4();
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ab4, fb0, fb1, ab1);
}
if(ao4 != null){
      ao4.m2(ab2, ab3, ab4, fb0);
}
    double ld3 = 377.29738312477366;
if(fo1 != null){
      fo0 = fo1.m4(ld3, fd0, fd1, ld2);
}
    fb1 = ld3 < fd0;
    Thought lo4 = Thought8.getInstance(ao1, ao2, ao3, ao4);
if(fo0 != null){
      ab1 = fo0.m2(fo1, ao1, ao2, ao3, fd1, ld2, ld3, fd0, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      ao4 = fo0.m4(fd1, ld2, ld3, fd0, fb1, ab1, ab2, ab3);
}
    double ld5 = 898.250766088875;
if(fo1 != null){
      ab4 = fo1.m2(ao1, ao2, ao3, ao4, fd0, fd1, ld2, ld3);
}
    double ld6 = 65.6255512936507;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(ao1 != null){
      fb0 = ao1.m2(ao2, ao3, ao4, fo0, fb1, ab1, ab2, ab3);
}
    double ld7 = 840.3097930575603;
if(ao1 != null){
      fo1 = ao1.m4(ab4, fb0, fb1, ab1);
}
    boolean lb8 = true;

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
    double ld0 = 619.3120151124256;
if(ao3 != null){
      ao2 = ao3.m4(ld0, ad1, ad2, ad3);
}
    ab1 = ad4 < fd0;
    fd1 = ld0 - ad1;
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
}
    fd1 *= -1;
    Output.points[8][0] -= ld0;
        fb1 = ad1 < ad2;
if(fo0 != null){
      ao4 = fo0.m4(ad3, ad4, fd0, fd1, ab1, ab2, ab3, ab4);
}
    double ld1 = 770.767779994874;
    double ld2 = 721.881468137929;
    double ld3 = 674.2088638931913;
    Output.points[8][1] += ld0;

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
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fb1 = fo0.m2();
}
    double ld0 = 144.5070258102441;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    Thought lo1 = Thought16.getInstance(fb0, fb1, fb0, fb1);
if(fo1 != null){
      fo0 = fo1.m4(ld0, fd0, fd1, ld0);
}
    fb0 = fb1 || fb0;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 || fb1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld0, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
    fd1 = ld0 + fd0;
    fb1 = fb0 && fb1;
    fb0 = fb1 && fb0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, ld0, fd0, fd1, ld0);
}
        boolean lb2 = false;
    Output.points[8][2] += fd0;
if(fo0 != null){
      fo1 = fo0.m4();
}
    fb0 = fd1 > ld0;
    fb1 = !lb2;
    double ld3 = 643.0683480236187;

Thought.STACK_COUNTER++;
return ld3;
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
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
}
    fb1 = ab1 || ab2;
    Output.points[8][3] -= fd0;
if(fo0 != null){
      fo1 = fo0.m4(ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
    ab1 = !ab2;
    double ld0 = 765.3501507918627;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, ld0, fd0, fd1, ab3, ab4, fb0, fb1);
}
    boolean lb1 = true;
    Output.points[8][4] -= ld0;
    lb1 = fd0 < fd1;
    boolean lb2 = true;
if(fo1 != null){
      fo0 = fo1.m4(ld0, fd0, fd1, ld0, lb2, ab1, ab2, ab3);
}
if(fo0 != null){
      ab4 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0);
}
    fd1 = ld0 - fd0;
    fd1 = ld0 + fd0;
if(fo0 != null){
      fo1 = fo0.m4();
}
    fb0 = !fb1;
    lb1 = lb2 || ab1;
    ab2 = ab3 && ab4;
    Thought lo3 = Thought6.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, lb1, lb2);
    Output.points[8][5] -= fd1;
    boolean lb4 = true;
if(fo0 != null){
      fo1 = fo0.m4(lb4, ab1, ab2, ab3);
}
    Output.points[8][6] += ld0;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld0, fd0);
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
double m3(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1);
}
    boolean lb0 = false;
    boolean lb1 = true;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, lb1, fb0, fb1, lb0);
}
    lb1 = !fb0;
if(fo1 != null){
      fd0 = fo1.m3(fd1, ad1, ad2, ad3, fb1, lb0, lb1, fb0);
}
    ad4 = fd0 + fd1;
if(fo0 != null){
      ad1 = fo0.m3(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
if(fo1 != null){
      fd1 = fo1.m3();
}
    double ld2 = 839.9282950904391;
    Thought lo3 = Thought4.getInstance(fo0, fo1, fo0, fo1, fb1, lb0, lb1, fb0);
    fb1 = !lb0;
    lb1 = !fb0;
    fb1 = !lb0;

Thought.STACK_COUNTER++;
return ld2;
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
if(fo0 != null){
      ad2 = fo0.m3(ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(ad3, ad4, fd0, fd1);
}
    ad1 *= -1;
    ad2 = ad3 - ad4;
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1);
}
    ab1 = !ab2;
    fd0 = fd1 - ad1;
if(fo0 != null){
      ad2 = fo0.m3(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, ab3, ab4, fb0, fb1);
}
    Output.points[8][7] += ad1;
if(fo0 != null){
      fo1 = fo0.m4(ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
}
    boolean lb0 = false;

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
}
    fb0 = !fb1;
if(ao3 != null){
      ao2 = ao3.m4();
}
    fd0 *= -1;
if(ao4 != null){
      ao4.m1(fo0, fo1, ao1, ao2, fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
    Thought lo0 = Thought1.getInstance(fb0, fb1, fb0, fb1);
    fb0 = !fb1;
    fd1 *= -1;
    fd0 = fd1 - fd0;
if(ao4 != null){
      ao3 = ao4.m4(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo0.m1(fo1, ao1, ao2, ao3);
}
if(ao4 != null){
      fb0 = ao4.m2(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
if(ao3 != null){
      fd1 = ao3.m3(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(ao4 != null){
      ao4.m1(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1);
}
if(ao3 != null){
      ao3.m1();
}

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0);
}
if(ao1 != null){
      ao1.m1();
}
    fd1 *= -1;
if(ao2 != null){
      fb1 = ao2.m2(ao3, ao4, fo0, fo1, fb0, fb1, fb0, fb1);
}
if(ao2 != null){
      ao1 = ao2.m4(fb0, fb1, fb0, fb1);
}
if(ao3 != null){
      ad1 = ao3.m3(ad2, ad3, ad4, fd0);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
    fd1 *= -1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
if(ao4 != null){
      fd0 = ao4.m3(fd1, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
}
    fb0 = ad4 < fd0;
if(fo0 != null){
      fb1 = fo0.m2(fo1, ao1, ao2, ao3, fd1, ad1, ad2, ad3);
}
    fb0 = fb1 || fb0;
    fb1 = fb0 || fb1;
    double ld0 = 197.72847056655263;
    fb0 = ad3 < ad4;
if(ao4 != null){
      fd0 = ao4.m3();
}
    fb1 = fb0 && fb1;
    boolean lb1 = false;
    fd1 = ld0 - ad1;
    boolean lb2 = true;

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}
    fd1 = fd0 - fd1;
    Output.points[8][8] += fd0;
    Output.points[0][0] += fd1;
    fd0 *= -1;
    ab1 = fd1 < fd0;
if(ao2 != null){
      ao1 = ao2.m4();
}
if(ao3 != null){
      fd1 = ao3.m3(ao4, fo0, fo1, ao1, ab2, ab3, ab4, fb0);
}
    fb1 = ab1 && ab2;
    boolean lb0 = false;
    fd0 = fd1 + fd0;
    fd1 = fd0 + fd1;
if(ao2 != null){
      ab2 = ao2.m2(ab3, ab4, fb0, fb1);
}
    lb0 = ab1 || ab2;
if(ao3 != null){
      ab3 = ao3.m2(fd0, fd1, fd0, fd1);
}
    fd0 = fd1 - fd0;
if(ao4 != null){
      ab4 = ao4.m2(fo0, fo1, ao1, ao2);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0, fb0, fb1, lb0, ab1);
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if(ao1 != null){
      ab1 = ao1.m2(ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, ad1, ad2);
}
    ad3 = ad4 - fd0;
if(ao3 != null){
      ao2 = ao3.m4();
}
    double ld0 = 122.60835850650533;
    double ld1 = 38.061304233292205;
if(ao4 != null){
      ad4 = ao4.m3(fo0, fo1, ao1, ao2, fb1, ab1, ab2, ab3);
}
    fd0 = fd1 - ld0;
    for(int i0=0; i0<10; i0++){
        boolean lb2 = false;
if(ao3 != null){
          ab3 = ao3.m2(ab4, fb0, fb1, lb2);
}
if(ao4 != null){
          ao4.m3(ld1, ad1, ad2, ad3);
}
if(fo0 != null){
          ab1 = fo0.m2(fo1, ao1, ao2, ao3);
}
        Thought lo3 = Thought13.getInstance(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ld0, ab2, ab3, ab4, fb0);
        fb1 = lb2 && ab1;
        }
    ab3 = ab4 || fb0;
    fb1 = ld1 > ad1;
if(ao2 != null){
      ab1 = ao2.m2(ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, ld0, ld1, ad1);
}
    ad2 = ad3 + ad4;

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
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
    Thought lo0 = Thought5.getInstance();
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    double ld1 = 402.71843533073906;
    fb1 = fd0 < fd1;
    fb0 = fb1 || fb0;
if(fo0 != null){
      fb1 = fo0.m2(fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo1.m1(ld1, fd0, fd1, ld1);
}
    boolean lb2 = false;
if(fo0 != null){
      lb2 = fo0.m2(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld1, fd0, fb0, fb1, lb2, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd1, ld1, fd0, fd1, fb1, lb2, fb0, fb1);
}
    lb2 = fb0 && fb1;
    double ld3 = 234.98541113461098;
    boolean lb4 = true;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld1, ld3, fd0, fd1);
}
    ld1 *= -1;
if(fo1 != null){
      lb2 = fo1.m2();
}
    ld3 = fd0 + fd1;
    boolean lb5 = true;
    double ld6 = 16.74509997306336;
if(fo0 != null){
      ld1 = fo0.m3(fo1, fo0, fo1, fo0, lb4, lb5, fb0, fb1);
}
if(fo1 != null){
      lb2 = fo1.m2(lb4, lb5, fb0, fb1);
}
    Thought lo7 = Thought6.getInstance(ld3, ld6, fd0, fd1);

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
Thought m4(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
    double ld0 = 862.9476778874513;
    Thought lo1 = Thought17.getInstance(fo1, fo0, fo1, fo0);
    ld0 = fd0 - fd1;
    ab1 = ld0 > fd0;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld0, fd0, fb1, ab1, ab2, ab3);
}
    Thought lo2 = Thought15.getInstance(fo0, fo1, fo0, fo1, fd1, ld0, fd0, fd1);
    ld0 *= -1;
    boolean lb3 = false;
if(fo0 != null){
      ab3 = fo0.m2();
}
    for(int i0=0; i0<10; i0++){
        fd0 = fd1 + ld0;
        ab4 = !fb0;
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
    fb0 = ad2 < ad3;
    ad4 = fd0 + fd1;
    fb1 = ad1 > ad2;
    fb0 = !fb1;
        boolean lb0 = false;
    ad3 = ad4 + fd0;
    lb0 = fd1 > ad1;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fb0, fb1, lb0, fb0);
}
    ad2 = ad3 - ad4;
if(fo0 != null){
      fo1 = fo0.m4(fb1, lb0, fb0, fb1);
}
if(fo1 != null){
      fd0 = fo1.m3(fd1, ad1, ad2, ad3);
}
        double ld1 = 62.772741935950826;
    lb0 = !fb0;
    fb1 = lb0 && fb0;
    boolean lb2 = false;
    fb0 = fb1 || lb0;
    boolean lb3 = true;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    double ld4 = 221.82789322366784;
    lb2 = !lb3;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, fb0, fb1, lb0, lb2);
}
    lb3 = fd1 > ld1;

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
    ab2 = ab3 || ab4;
if(fo0 != null){
      fo1 = fo0.m4(ad2, ad3, ad4, fd0, fb0, fb1, ab1, ab2);
}
    if (ab3) {
        boolean lb0 = false;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3);
}
if(fo1 != null){
          ab3 = fo1.m2();
}
        ab4 = !fb0;
        Output.points[0][1] += ad4;
        fd0 = fd1 - ad1;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, lb0, ab1, ab2);
}
if(fo1 != null){
          fo0 = fo1.m4(ab3, ab4, fb0, fb1);
}
        ad2 = ad3 + ad4;
        } else {
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
    fb0 = fd0 < fd1;
    fd0 = fd1 - fd0;
    fb1 = fb0 || fb1;
    Thought lo0 = Thought4.getInstance(fd1, fd0, fd1, fd0);
    fd1 *= -1;
    fb0 = fb1 && fb0;
    fb1 = fd0 < fd1;
if(ao2 != null){
      fb0 = ao2.m2(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
    fb0 = !fb1;
if(ao1 != null){
      fd1 = ao1.m3(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);
}
if(ao1 != null){
      fo1 = ao1.m4();
}
    fb0 = fb1 || fb0;
    fb1 = !fb0;
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
}
    fd0 = fd1 - fd0;
    double ld1 = 17.61802323664195;
    boolean lb2 = false;
if(ao2 != null){
      ao1 = ao2.m4(fb0, fb1, lb2, fb0);
}
    Output.points[0][2] -= fd0;
    fd1 = ld1 + fd0;
    fd1 = ld1 + fd0;
    fb1 = fd1 > ld1;
if(ao3 != null){
      fd0 = ao3.m3(fd1, ld1, fd0, fd1);
}
    lb2 = fb0 || fb1;
if(ao4 != null){
      ld1 = ao4.m3(fo0, fo1, ao1, ao2);
}
    boolean lb3 = true;

Thought.STACK_COUNTER++;
return ao3;
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
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = fd1 > ad1;
if(ao2 != null){
      fb1 = ao2.m2(ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
    double ld0 = 451.3183526592361;
    fd0 = fd1 + ld0;
    fb1 = fb0 && fb1;
if(ao3 != null){
      fb0 = ao3.m2(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4);
}
    boolean lb1 = false;
    boolean lb2 = true;
    Thought lo3 = Thought17.getInstance();
    Output.points[0][3] -= fd0;
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, lb2, fb0, fb1, lb1);
}
    Output.points[0][4] += fd1;
    ld0 = ad1 + ad2;
    ad3 = ad4 + fd0;
if(ao2 != null){
      ao1 = ao2.m4(lb2, fb0, fb1, lb1);
}
    lb2 = !fb0;
    fb1 = lb1 && lb2;
    boolean lb4 = false;
if(ao3 != null){
      ao3.m2(fd1, ld0, ad1, ad2);
}
if(ao4 != null){
      lb4 = ao4.m2(fo0, fo1, ao1, ao2);
}
    ad3 = ad4 + fd0;

Thought.STACK_COUNTER++;
return ao3;
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
    boolean lb0 = false;
    fd0 = fd1 - fd0;
    ab1 = ab2 || ab3;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, ab4, fb0, fb1, lb0);
}
    boolean lb1 = true;
    Thought lo2 = Thought2.getInstance(fd1, fd0, fd1, fd0, lb1, ab1, ab2, ab3);
    boolean lb3 = false;
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}
    double ld4 = 475.9309912633855;
    ab3 = !ab4;
    Thought lo5 = Thought14.getInstance();
    fb0 = fb1 && lb0;
    boolean lb6 = false;
    double ld7 = 134.88374570081612;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, lb1, lb3, lb6, ab1);
}
if(ao2 != null){
      ao1 = ao2.m4(ab2, ab3, ab4, fb0);
}
    fb1 = ld7 > fd0;
    fd1 = ld4 + ld7;
    boolean lb8 = true;
    Output.points[0][5] -= fd0;

Thought.STACK_COUNTER++;
return ao3;
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
    double ld0 = 256.4121516508786;
    double ld1 = 584.9606122419167;
    if (ab1) {
        ab2 = ab3 && ab4;
        ld1 *= -1;
if(ao2 != null){
          fb0 = ao2.m2(ad1, ad2, ad3, ad4);
}
        fb1 = ab1 && ab2;
        ab3 = fd0 > fd1;
        Output.points[0][6] -= ld0;
        if (ab4) {
            ld1 = ad1 + ad2;
            fb0 = ad3 < ad4;
if(ao4 != null){
              ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
if(ao4 != null){
              ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, ld0, ld1, fb1, ab1, ab2, ab3);
}
            ab4 = !fb0;
            boolean lb2 = false;
            fb0 = !fb1;
            lb2 = ab1 || ab2;
            ab3 = ab4 && fb0;
            ad1 = ad2 - ad3;
            fb1 = lb2 || ab1;
            ad4 = fd0 + fd1;
            Thought lo3 = Thought6.getInstance(ld0, ld1, ad1, ad2, ab2, ab3, ab4, fb0);
            boolean lb4 = false;
if(ao3 != null){
              ao3.m3(ao4, fo0, fo1, ao1, ad3, ad4, fd0, fd1);
}
if(ao3 != null){
              ao2 = ao3.m4();
}
            ld0 = ld1 - ad1;
if(fo0 != null){
              ao4 = fo0.m4(fo1, ao1, ao2, ao3, fb0, fb1, lb2, lb4);
}
            boolean lb5 = false;
}}
Thought.STACK_COUNTER++;
return ao4;
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
    fd1 = fd0 - fd1;
    boolean lb0 = true;
    boolean lb1 = true;
    Output.points[0][7] += fd0;
    lb0 = !lb1;
    fd1 = fd0 + fd1;
    fd0 *= -1;
    fb0 = fd1 > fd0;
    fd1 = fd0 - fd1;
    fb1 = lb0 && lb1;
    Output.points[0][8] += fd0;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} 
}
void own() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
    fb0 = fb1 || fb0;
if(fo0 != null){
      fo0.m3(fb1, fb0, fb1, fb0);
}
    Thought lo0 = Thought10.getInstance(fd1, fd0, fd1, fd0);
    fb1 = fd1 < fd0;
    fd1 *= -1;
    Thought lo1 = Thought17.getInstance(fo1, fo0, fo1, fo0);
    boolean lb2 = false;
    Output.points[1][0] += fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, lb2, fb0, fb1, lb2);
}
    double ld3 = 103.28139783976098;
    fb0 = fd0 < fd1;
if(fo1 != null){
      fo1.m1(ld3, fd0, fd1, ld3, fb1, lb2, fb0, fb1);
}
    Thought lo4 = Thought0.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, ld3, fd0);
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, lb2, fb0, fb1, lb2);
}
    Thought lo5 = Thought7.getInstance(fb0, fb1, lb2, fb0);
    fb1 = ld3 > fd0;
if(fo1 != null){
      lb2 = fo1.m2(fd1, ld3, fd0, fd1);
}
    ld3 *= -1;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0);
}
    fd0 = fd1 - ld3;
    double ld6 = 224.47531146392913;
    ld6 = fd0 - fd1;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ld3, ld6, fd0, fd1, fb1, lb2, fb0, fb1);
}
    double ld7 = 920.3355952357775;
    boolean lb8 = false;
if(fo0 != null){
      lb2 = fo0.m2(ld3, ld6, ld7, fd0, lb8, fb0, fb1, lb2);
}
    double ld9 = 107.24889457217326;
    fd0 = fd1 - ld3;

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
    fb1 = fb0 && fb1;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
        boolean lb0 = false;
    fb0 = fb1 || lb0;
    Thought lo1 = Thought18.getInstance(fb0, fb1, lb0, fb0);
    fb1 = lb0 && fb0;
if(fo1 != null){
      fb1 = fo1.m2(fd1, fd0, fd1, fd0);
}
    Thought lo2 = Thought12.getInstance(fo0, fo1, fo0, fo1);
if(fo0 != null){
      lb0 = fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, lb0, fb0);
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
