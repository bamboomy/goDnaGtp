package genetic;
import java.util.ArrayList;
class Thought70 extends Thought{
private static ArrayList<Thought70> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = true;
private double fd0 = 404.80822388556885;
private double fd1 = 513.8243317343388;
private Thought fo0 = null;
private Thought fo1 = null;
Thought70 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought70 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought70 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought70 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought70 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought70 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought70 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought70 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought70 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought70 instance = new Thought70 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought70 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought70 instance = new Thought70 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought70 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought70 instance = new Thought70 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought70 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought70 instance = new Thought70 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought70 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought70 instance = new Thought70 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought70 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought70 instance = new Thought70 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought70 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought70 instance = new Thought70 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought70 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought70 instance = new Thought70 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
if (false) { throw new CountDownExc(-1); }
    fd1 = fd0 + fd1;
    if (fb0) {
        fb1 = fd0 < fd1;
        fd0 = fd1 + fd0;
if(fo1 != null){
          fd1 = fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
        fd0 *= -1;
        boolean lb0 = true;
if(fo1 != null){
          fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
        Output.points[1][1] += fd1;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
        lb0 = !fb0;
        fd0 = fd1 - fd0;
        fd1 = fd0 + fd1;
        fb1 = lb0 || fb0;
if(fo0 != null){
          fb1 = fo0.m2(lb0, fb0, fb1, lb0);
}
        boolean lb1 = false;
        fd0 = fd1 - fd0;
        lb1 = fd1 < fd0;
if(fo1 != null){
          fd1 = fo1.m3();
}
        Output.points[1][2] += fd0;
        fb0 = fd1 > fd0;
        double ld2 = 508.9088086670415;
if(fo0 != null){
          fo0.m1(fd0, fd1, ld2, fd0, fb1, lb0, lb1, fb0);
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
void m1(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = ab3 || ab4;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1);
}
    for(int i0=0; i0<10; i0++){
if(fo0 != null){
          fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, ab1, ab2);
}
        Output.points[1][3] += fd1;
        ab3 = ab4 && fb0;
        Thought lo0 = Thought98.getInstance(fo1, fo0, fo1, fo0, fb1, ab1, ab2, ab3);
if(fo0 != null){
          fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
        ab4 = fb0 && fb1;
if(fo1 != null){
          fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
        ab1 = fd1 > fd0;
        ab2 = fd1 < fd0;
        double ld1 = 11.364524082110561;
        double ld2 = 81.42625120513279;
        Thought lo3 = Thought64.getInstance(ab3, ab4, fb0, fb1);
        ab1 = ab2 && ab3;
        ab4 = !fb0;
        Thought lo4 = Thought60.getInstance();
        for(int i1=0; i1<10; i1++){
            fb1 = ab1 && ab2;
if(fo0 != null){
              ld2 = fo0.m3(fd0, fd1, ld1, ld2, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
              fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
            Thought lo5 = Thought30.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ld1, ld2, ab1, ab2, ab3, ab4);
if(fo1 != null){
              fd0 = fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, ab1, ab2);
}
            Thought lo6 = Thought32.getInstance(fd1, ld1, ld2, fd0);
            ab3 = fd1 < ld1;
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
if (false) { throw new CountDownExc(-1); }
    double ld0 = 635.385019403646;
if(fo0 != null){
      ad1 = fo0.m3(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4(fb1, fb0, fb1, fb0);
}
    if (fb1) {
        fb0 = fd1 < ld0;
        fb1 = ad1 < ad2;
        } else {
        ad3 *= -1;
if(fo0 != null){
          fo1 = fo0.m4();
}
        fb0 = fb1 || fb0;
        ad4 *= -1;
        fd0 = fd1 - ld0;
        boolean lb1 = false;
if(fo1 != null){
          ad1 = fo1.m3(ad2, ad3, ad4, fd0, fb0, fb1, lb1, fb0);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
          fo0.m2(fo1, fo0, fo1, fo0, fd1, ld0, ad1, ad2, fb1, lb1, fb0, fb1);
}
        lb1 = fb0 && fb1;
        ad3 = ad4 - fd0;
        fd1 = ld0 - ad1;
        Thought lo2 = Thought21.getInstance(fo1, fo0, fo1, fo0, lb1, fb0, fb1, lb1);
if(fo0 != null){
          fo1 = fo0.m4(ad2, ad3, ad4, fd0);
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
void m1(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = ad1 < ad2;
    ab3 = ab4 && fb0;
    Thought lo0 = Thought68.getInstance(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
if(fo1 != null){
      fo1.m1(fb1, ab1, ab2, ab3);
}
    ab4 = !fb0;
    double ld1 = 559.3405646888724;
    ld1 = ad1 - ad2;
    Thought lo2 = Thought55.getInstance();
    Thought lo3 = Thought6.getInstance(ad3, ad4, fd0, fd1, fb1, ab1, ab2, ab3);
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      ld1 = fo1.m3(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, ab4, fb0, fb1, ab1);
}
    boolean lb4 = true;
    Output.points[1][4] += fd0;
    ab1 = !ab2;
    for(int i0=0; i0<10; i0++){
        fd1 = ld1 - ad1;
        boolean lb5 = true;
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
if (false) { throw new CountDownExc(-1); }
    fb1 = !fb0;
    for(int i0=0; i0<10; i0++){
        fb1 = fd0 < fd1;
if(ao1 != null){
          ao1.m3(ao2, ao3, ao4, fo0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
          fb0 = fo1.m2(fd0, fd1, fd0, fd1);
}
if(ao1 != null){
          ao1.m2(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);
}
if(ao1 != null){
          fo1 = ao1.m4(fb1, fb0, fb1, fb0);
}
        double ld0 = 220.7402289246534;
        boolean lb1 = true;
        Thought lo2 = Thought75.getInstance();
        Output.points[1][5] += ld0;
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
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
    Thought lo1 = Thought34.getInstance(ad2, ad3, ad4, fd0, fb0, fb1, lb0, fb0);
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1);
}
    fd1 = ad1 - ad2;
    double ld2 = 769.0766309862775;
    ad2 = ad3 - ad4;
    fb1 = lb0 || fb0;
    fb1 = fd0 > fd1;
    ld2 = ad1 + ad2;
    lb0 = ad3 < ad4;
if(ao1 != null){
      fd0 = ao1.m3(ao2, ao3, ao4, fo0, fd1, ld2, ad1, ad2, fb0, fb1, lb0, fb0);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fb1, lb0, fb0, fb1);
}
    ad3 = ad4 + fd0;
    boolean lb3 = true;
    double ld4 = 827.0345355994607;
if(ao1 != null){
      fo1 = ao1.m4(fd0, fd1, ld2, ld4);
}
    ad1 = ad2 - ad3;
    ad4 = fd0 + fd1;
    lb0 = ld2 < ld4;
    lb3 = ad1 < ad2;
    double ld5 = 627.6988753553217;
    double ld6 = 890.5722035753537;
    ad1 *= -1;
    fb0 = !fb1;
        ad2 *= -1;

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
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
    boolean lb1 = true;
if(ao1 != null){
      ao1.m3(lb0, lb1, ab1, ab2);
}
        ab3 = ab4 && fb0;
    boolean lb2 = true;
if(ao3 != null){
      ao2 = ao3.m4();
}
    fb0 = fd0 > fd1;
    fb1 = fd0 > fd1;
    Output.points[1][6] -= fd0;
    boolean lb3 = false;
    fd1 = fd0 + fd1;
if(fo0 != null){
      ao4 = fo0.m4(fd0, fd1, fd0, fd1, lb0, lb1, lb2, lb3);
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
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
    lb0 = ab1 && ab2;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    Thought lo1 = Thought67.getInstance(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4, ab3, ab4, fb0, fb1);
    lb0 = !ab1;
if(fo1 != null){
      fo1.m2(ao1, ao2, ao3, ao4, ab2, ab3, ab4, fb0);
}
    double ld2 = 140.80278455603815;
    fb1 = lb0 && ab1;
        ab2 = ad4 < fd0;
    fd1 = ld2 - ad1;
if(fo0 != null){
      fo0.m1(ad2, ad3, ad4, fd0);
}
    boolean lb3 = true;
    ab2 = ab3 || ab4;
    Thought lo4 = Thought16.getInstance(fo1, ao1, ao2, ao3, fd1, ld2, ad1, ad2);
    fb0 = ad3 < ad4;
    fd0 = fd1 - ld2;
    fb1 = lb0 && lb3;
    ab1 = ad1 > ad2;
    ad3 *= -1;
if(ao4 != null){
      ao4.m3(ab2, ab3, ab4, fb0);
}
    Output.points[1][7] += ad4;
    fb1 = lb0 || lb3;
if(fo0 != null){
      fo0.m3();
}
    fd0 = fd1 - ld2;

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
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fb0 = fo1.m2(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0);
}
    double ld0 = 194.88605165032322;
    boolean lb1 = true;
    fb0 = fd0 > fd1;
    Thought lo2 = Thought82.getInstance(fo1, fo0, fo1, fo0, ld0, fd0, fd1, ld0, fb1, lb1, fb0, fb1);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb1, fb0, fb1, lb1);
}
        fb0 = fb1 && lb1;
    fb0 = fd0 > fd1;
if(fo1 != null){
      fb1 = fo1.m2(ld0, fd0, fd1, ld0);
}
    Thought lo3 = Thought33.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, ld0, fd0);
    lb1 = fd1 > ld0;
if(fo0 != null){
      fd0 = fo0.m3(fb0, fb1, lb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo1 != null){
      fo1.m2(fd1, ld0, fd0, fd1, fb1, lb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    lb1 = !fb0;
    fb1 = !lb1;
    double ld4 = 63.21880432420323;
    Thought lo5 = Thought91.getInstance(fo0, fo1, fo0, fo1, ld0, ld4, fd0, fd1, fb0, fb1, lb1, fb0);
    ld0 *= -1;

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
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
    fb0 = fb1 || ab1;
    double ld0 = 895.0823438308266;
    fd0 *= -1;
    fd1 = ld0 + fd0;
    fd1 = ld0 + fd0;
    Thought lo1 = Thought52.getInstance(fo0, fo1, fo0, fo1, fd1, ld0, fd0, fd1);
if(fo1 != null){
      fo0 = fo1.m4(ab2, ab3, ab4, fb0);
}
    double ld2 = 965.32711785303;
if(fo0 != null){
      fo0.m3();
}
    fb1 = ab1 && ab2;
    double ld3 = 882.7046236322298;
    ld0 = ld2 - ld3;

Thought.STACK_COUNTER++;
return ab3;
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
if (false) { throw new CountDownExc(-1); }
    ad2 *= -1;
    double ld0 = 425.2460135517889;
if(fo0 != null){
      fo1 = fo0.m4(ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
    fd1 *= -1;
    Output.points[1][8] += ld0;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1);
}
    ad1 = ad2 - ad3;
    ad4 = fd0 + fd1;
        ld0 = ad1 + ad2;
    double ld1 = 568.1251113768843;
    ad2 = ad3 - ad4;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld0, ld1, fb1, fb0, fb1, fb0);
}
    Output.points[2][0] -= ad1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    ad2 = ad3 - ad4;
if(fo0 != null){
      fd0 = fo0.m3(fd1, ld0, ld1, ad1);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4(fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
    Thought lo2 = Thought83.getInstance();
    fb1 = !fb0;
    boolean lb3 = false;
    fb0 = fd1 > ld0;
    ld1 = ad1 - ad2;

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
boolean m2(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ad1 > ad2;
if(fo0 != null){
      ad3 = fo0.m3(ad4, fd0, fd1, ad1, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, fb1, ab1, ab2, ab3);
}
    double ld0 = 32.46844739689273;
    fd0 = fd1 + ld0;
    Output.points[2][1] += ad1;
    ab4 = ad2 > ad3;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, ab1, ab2);
}
    boolean lb1 = true;
    ab2 = ab3 && ab4;
if(fo0 != null){
      fo1 = fo0.m4(ad4, fd0, fd1, ld0);
}
    fb0 = !fb1;
    ad1 = ad2 - ad3;
if(fo1 != null){
      lb1 = fo1.m2(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ld0);
}

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      fd1 = ao1.m3(fb0, fb1, fb0, fb1);
}
    fb0 = fb1 && fb0;
    double ld0 = 674.3942165313816;
    ld0 = fd0 - fd1;
if(ao3 != null){
      ao2 = ao3.m4();
}
    double ld1 = 217.15505302696567;
        fb1 = ld0 > ld1;
    double ld2 = 746.4403670457934;
        boolean lb3 = false;
    Thought lo4 = Thought69.getInstance(ld2, fd0, fd1, ld0, lb3, fb0, fb1, lb3);
if(ao4 != null){
      fb0 = ao4.m2(fo0, fo1, ao1, ao2);
}
    double ld5 = 686.7508334606637;
if(ao3 != null){
      ld1 = ao3.m3(ao4, fo0, fo1, ao1, ld2, ld5, fd0, fd1, fb1, lb3, fb0, fb1);
}
    lb3 = !fb0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb1, lb3, fb0, fb1);
}
if(ao3 != null){
      ao2 = ao3.m4(ld0, ld1, ld2, ld5);
}
    Thought lo6 = Thought87.getInstance(ao4, fo0, fo1, ao1, fd0, fd1, ld0, ld1);

Thought.STACK_COUNTER++;
return lb3;
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
if (false) { throw new CountDownExc(-1); }
        ad1 *= -1;
if(ao2 != null){
      fb1 = ao2.m2(fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
        ad2 = ad3 + ad4;
    fb0 = fd0 > fd1;
    fb1 = !fb0;
    fb1 = fb0 && fb1;
if(ao3 != null){
      fb0 = ao3.m2();
}
    fb1 = ad1 < ad2;
if(ao4 != null){
      fb0 = ao4.m2(ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fb1, fb0, fb1, fb0);
}
    fd0 = fd1 + ad1;
    fb1 = fb0 && fb1;
if(fo0 != null){
      fo0.m3(ad2, ad3, ad4, fd0);
}
        fd1 *= -1;
    fb0 = !fb1;
    fb0 = fb1 || fb0;
    ad1 = ad2 - ad3;
    fb1 = fb0 && fb1;
    Thought lo0 = Thought2.getInstance(fo1, ao1, ao2, ao3, ad4, fd0, fd1, ad1);
if(ao4 != null){
      ao4.m1(fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      ad2 = fo0.m3();
}
if(fo1 != null){
      fb0 = fo1.m2(ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(ao1 != null){
      ad1 = ao1.m3(ao2, ao3, ao4, fo0);
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    if (ab1) {
        fd1 *= -1;
        fd0 = fd1 + fd0;
        boolean lb0 = false;
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb0, fb1, lb0, ab1);
}
        fd1 = fd0 + fd1;
        boolean lb1 = false;
if(ao2 != null){
          ao2.m3(fd0, fd1, fd0, fd1);
}
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1);
}
        ab1 = ab2 && ab3;
        ab4 = fd0 > fd1;
        boolean lb2 = true;
if(ao3 != null){
          ab4 = ao3.m2(fb0, fb1, lb0, lb1);
}
        lb2 = !ab1;
        ab2 = ab3 || ab4;
        double ld3 = 297.61227437678264;
        ld3 = fd0 + fd1;
        fb0 = !fb1;
        lb0 = lb1 && lb2;
}
Thought.STACK_COUNTER++;
return ab4;
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
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought36.getInstance();
    boolean lb1 = false;
    lb1 = !ab1;
if(ao3 != null){
      ao2 = ao3.m4(ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
    fb1 = fd0 < fd1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ad1, ad2, ad3, ad4, lb1, ab1, ab2, ab3);
}
    fd0 = fd1 - ad1;
        ab4 = fb0 || fb1;
    ad2 = ad3 - ad4;
    double ld2 = 42.38073345060959;
    ad4 = fd0 - fd1;
    double ld3 = 265.3882058269834;
if(ao4 != null){
      ao4.m3(fo0, fo1, ao1, ao2, lb1, ab1, ab2, ab3);
}
    ab4 = ld2 < ld3;
    fb0 = ad1 > ad2;
    boolean lb4 = true;
if(ao4 != null){
      ao3 = ao4.m4(ad3, ad4, fd0, fd1);
}
if(fo0 != null){
      fb0 = fo0.m2(fo1, ao1, ao2, ao3, ld2, ld3, ad1, ad2);
}
    fb1 = ad3 < ad4;
if(fo0 != null){
      ao4 = fo0.m4(lb1, lb4, ab1, ab2);
}
    ab3 = !ab4;
    fb0 = fb1 || lb1;

Thought.STACK_COUNTER++;
return lb4;
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
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo1 != null){
      fo1.m1(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    boolean lb0 = true;
    fd0 = fd1 - fd0;
        lb0 = fb0 || fb1;
    lb0 = fd1 < fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fd1 = fd0 - fd1;
    fb0 = fd0 > fd1;
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, lb0, fb0, fb1);
}
        boolean lb1 = true;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb1, lb0, fb0, fb1);
}
        if (lb1) {
            fd0 = fd1 - fd0;
            fd1 = fd0 - fd1;
            fd0 = fd1 - fd0;
if(fo1 != null){
              fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
            fd1 *= -1;
            lb0 = fd0 > fd1;
if(fo0 != null){
              fo0.m1(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
            fd0 = fd1 + fd0;
            boolean lb2 = true;
if(fo0 != null){
              fo1 = fo0.m4(lb0, fb0, fb1, lb2);
}
            } else {
if(fo1 != null){
              fo1.m1();
}
if(fo0 != null){
              fo0.m1(fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb1);
}
            lb0 = fb0 && fb1;
}}
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
double m3(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought15.getInstance(fo1, fo0, fo1, fo0);
    fd0 *= -1;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
    fd1 = fd0 + fd1;
    boolean lb1 = false;
    ab4 = fb0 || fb1;
    lb1 = fd0 < fd1;
    fd0 *= -1;
    Thought lo2 = Thought86.getInstance(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
if(fo0 != null){
      fo0.m2(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    double ld3 = 947.254889316509;
    fb0 = fb1 || lb1;
    Thought lo4 = Thought34.getInstance(ab1, ab2, ab3, ab4);
if(fo0 != null){
      fo1 = fo0.m4();
}
    double ld5 = 438.7186936662592;
    fb0 = ld5 < fd0;
if(fo1 != null){
      fd1 = fo1.m3(ld3, ld5, fd0, fd1, fb1, lb1, ab1, ab2);
}
    ab3 = !ab4;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0);
}

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
double m3(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    for(int i0=0; i0<10; i0++){
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
        fb1 = fb0 || fb1;
        fb0 = !fb1;
        }
    fb0 = fb1 && fb0;
    Thought lo0 = Thought39.getInstance(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
    fd1 *= -1;
    ad1 = ad2 - ad3;
    fb1 = !fb0;
if(fo1 != null){
      ad4 = fo1.m3(fd0, fd1, ad1, ad2);
}
    Thought lo1 = Thought24.getInstance(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
    fb1 = ad1 < ad2;

Thought.STACK_COUNTER++;
return ad3;
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
if (false) { throw new CountDownExc(-1); }
    ab1 = ab2 && ab3;
if(fo1 != null){
      fo0 = fo1.m4(ab4, fb0, fb1, ab1);
}
    if (ab2) {
        boolean lb0 = true;
if(fo0 != null){
          fo0.m1();
}
        ab2 = ad2 > ad3;
        ad4 = fd0 + fd1;
if(fo0 != null){
          fo1 = fo0.m4(ad1, ad2, ad3, ad4, ab3, ab4, fb0, fb1);
}
        } else if (ab1) {
        boolean lb1 = true;
        Thought lo2 = Thought40.getInstance(fo1, fo0, fo1, fo0);
        boolean lb3 = true;
        lb3 = fd0 < fd1;
        Thought lo4 = Thought48.getInstance(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
        fb0 = fb1 && lb1;
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb1, fb0, fb1, fb0);
}
if(ao3 != null){
      ao2 = ao3.m4(fd1, fd0, fd1, fd0);
}
    fd1 = fd0 - fd1;
    for(int i0=0; i0<10; i0++){
if(ao4 != null){
          fd0 = ao4.m3(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0);
}
        Thought lo0 = Thought89.getInstance(fb1, fb0, fb1, fb0);
        fd1 = fd0 + fd1;
if(ao4 != null){
          ao3 = ao4.m4();
}
        fd0 = fd1 - fd0;
        fb1 = fd1 > fd0;
        fd1 *= -1;
        fb0 = fb1 || fb0;
        fb1 = fd0 < fd1;
        for(int i1=0; i1<10; i1++){
            fd0 = fd1 + fd0;
            }
        fb0 = fd1 < fd0;
        fb1 = fb0 || fb1;
if(fo0 != null){
          fo0.m2(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
        }
    fb0 = fb1 && fb0;
    double ld1 = 247.73694717776098;
    boolean lb2 = true;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
    fd0 *= -1;
if(fo1 != null){
      fd1 = fo1.m3(ao1, ao2, ao3, ao4, ld1, fd0, fd1, ld1, fb0, fb1, lb2, fb0);
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
if (false) { throw new CountDownExc(-1); }
    double ld0 = 507.2580005746387;
    Thought lo1 = Thought93.getInstance(ao1, ao2, ao3, ao4, fb0, fb1, fb0, fb1);
if(fo0 != null){
      ld0 = fo0.m3(ad1, ad2, ad3, ad4);
}
    Output.points[2][2] -= fd0;
if(fo1 != null){
      fb0 = fo1.m2(ao1, ao2, ao3, ao4, fd1, ld0, ad1, ad2);
}
    fb1 = fb0 && fb1;
    fb0 = fb1 && fb0;
    boolean lb2 = false;
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, lb2, fb0);
}
    fb1 = lb2 || fb0;
if(ao1 != null){
      ad3 = ao1.m3();
}
if(ao2 != null){
      ao2.m3(ad4, fd0, fd1, ld0, fb1, lb2, fb0, fb1);
}
    lb2 = fb0 || fb1;
    ad1 *= -1;
    if (lb2) {
        boolean lb3 = false;
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
if(ao3 != null){
          lb2 = ao3.m2(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0, fb0, fb1, lb3, lb2);
}
if(ao2 != null){
          fb0 = ao2.m2(ao3, ao4, fo0, fo1, fb1, lb3, lb2, fb0);
}
        fd1 *= -1;
        boolean lb4 = false;
        fb0 = fb1 || lb3;
        Thought lo5 = Thought17.getInstance(ld0, ad1, ad2, ad3);
        lb4 = lb2 && fb0;
        ad4 = fd0 + fd1;
        fb1 = lb3 && lb4;
        Thought lo6 = Thought20.getInstance(ao1, ao2, ao3, ao4, ld0, ad1, ad2, ad3);
        boolean lb7 = false;
}
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao1 = ao2.m4(ab1, ab2, ab3, ab4);
}
    fb0 = !fb1;
    boolean lb0 = false;
    Thought lo1 = Thought29.getInstance();
if(ao4 != null){
      ao3 = ao4.m4(fd1, fd0, fd1, fd0, lb0, ab1, ab2, ab3);
}
    ab4 = fd1 < fd0;
    boolean lb2 = true;
    fd1 = fd0 + fd1;
    double ld3 = 854.1369545667773;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
    boolean lb4 = false;
    ab3 = ld3 < fd0;
    ab4 = fd1 > ld3;
    fd0 *= -1;
    boolean lb5 = true;

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
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
}
    boolean lb0 = false;
        Output.points[2][3] -= fd0;
if(ao1 != null){
      fd1 = ao1.m3(ao2, ao3, ao4, fo0, fb0, fb1, lb0, ab1);
}
    ab2 = !ab3;
    Output.points[2][4] += ad1;
    ad2 *= -1;
    ab4 = !fb0;
if(ao1 != null){
      fo1 = ao1.m4(ad3, ad4, fd0, fd1);
}

Thought.STACK_COUNTER++;
return ad1;
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
if (false) { throw new CountDownExc(-1); }
        fb0 = fb1 && fb0;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    boolean lb0 = true;
    Thought lo1 = Thought43.getInstance(fb0, fb1, lb0, fb0);
if(fo0 != null){
      fo0.m2();
}
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0, fb1, lb0, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    lb0 = fd1 < fd0;
    boolean lb2 = false;
    lb2 = fb0 || fb1;
if(fo1 != null){
      lb0 = fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, lb2, fb0, fb1, lb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb2, fb0, fb1, lb0);
}
    lb2 = fd1 > fd0;
if(fo0 != null){
      fo0.m3(fd1, fd0, fd1, fd0);
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
if (false) { throw new CountDownExc(-1); }
        Output.points[2][5] -= fd1;
    ab1 = fd0 > fd1;
    ab2 = ab3 || ab4;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    fb0 = !fb1;
if(fo1 != null){
      fo0 = fo1.m4(ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    Thought lo0 = Thought42.getInstance(fd0, fd1, fd0, fd1, fb0, fb1, ab1, ab2);
if(fo0 != null){
      ab3 = fo0.m2(fo1, fo0, fo1, fo0);
}
    ab4 = fd0 > fd1;
    Output.points[2][6] += fd0;
    Thought lo1 = Thought22.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, ab1, ab2);

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
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
if(fo0 != null){
      ad2 = fo0.m3(ad3, ad4, fd0, fd1);
}
    ad1 = ad2 + ad3;
    boolean lb0 = true;
    ad4 *= -1;
    fb0 = fb1 || lb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2);
}
    ad3 = ad4 - fd0;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, lb0, fb0);
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
Thought m4(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = !ab2;
if(fo0 != null){
      fo0.m1();
}
    boolean lb0 = false;
if(fo0 != null){
      fo1 = fo0.m4(ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
}
    fd1 = ad1 - ad2;
    Thought lo1 = Thought72.getInstance(fo1, fo0, fo1, fo0);
    fb1 = ad3 < ad4;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2, lb0, ab1, ab2, ab3);
}
    boolean lb2 = true;
    ad3 = ad4 - fd0;
    ab3 = ab4 && fb0;
    fd1 = ad1 - ad2;
    boolean lb3 = true;
    ad3 *= -1;
    boolean lb4 = true;
if(fo1 != null){
      ab4 = fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, lb0, lb2);
}
    ad4 = fd0 + fd1;
if(fo0 != null){
      lb3 = fo0.m2(ad1, ad2, ad3, ad4);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2);
}
    lb4 = ab1 && ab2;
if(fo1 != null){
      fo1.m3(ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      ad3 = fo0.m3();
}
    boolean lb5 = true;
    lb0 = !lb2;
    double ld6 = 593.0690918232455;
if(fo1 != null){
      lb3 = fo1.m2(ad3, ad4, fd0, fd1, lb4, lb5, ab1, ab2);
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
if (false) { throw new CountDownExc(-1); }
    fd0 = fd1 + fd0;
    boolean lb0 = false;
    fb0 = !fb1;
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1);
}
    lb0 = !fb0;
    Output.points[2][7] -= fd1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, fb1, lb0, fb0, fb1);
}
    Output.points[2][8] += fd0;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, lb0, fb0, fb1, lb0);
}
if(ao2 != null){
      ao1 = ao2.m4(fd1, fd0, fd1, fd0);
}
    fd1 *= -1;
    fd0 = fd1 + fd0;
    fb0 = fb1 || lb0;
if(ao3 != null){
      fd1 = ao3.m3(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
}
    boolean lb1 = false;
    double ld2 = 943.499806598293;
        lb1 = fb0 && fb1;
    double ld3 = 150.60707188587477;
    ld2 *= -1;
    lb0 = lb1 && fb0;
if(ao2 != null){
      ao2.m3(fb1, lb0, lb1, fb0);
}
    fb1 = !lb0;
    for(int i0=0; i0<10; i0++){
        lb1 = !fb0;
if(ao3 != null){
          fb1 = ao3.m2();
}
if(ao4 != null){
          lb0 = ao4.m2(ld3, fd0, fd1, ld2, lb1, fb0, fb1, lb0);
}
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought68.getInstance(ao2, ao3, ao4, fo0);
    ad2 *= -1;
    fb1 = ad3 > ad4;
    Output.points[3][0] += fd0;
    fd1 = ad1 - ad2;
    Output.points[3][1] += ad3;
    fb0 = fb1 || fb0;
    boolean lb1 = true;
    Output.points[3][2] -= ad4;
if(fo1 != null){
      fd0 = fo1.m3(ao1, ao2, ao3, ao4, fd1, ad1, ad2, ad3, fb0, fb1, lb1, fb0);
}
    fb1 = lb1 && fb0;

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
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1, ab1, ab2, ab3, ab4);
}
    fb0 = !fb1;
    boolean lb0 = false;
    fd0 = fd1 - fd0;
    boolean lb1 = false;
    fd1 = fd0 + fd1;
    lb0 = lb1 || ab1;
if(ao1 != null){
      ao1.m1(fd0, fd1, fd0, fd1);
}
    Thought lo2 = Thought49.getInstance(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);
    double ld3 = 2.558849038906476;
    ld3 = fd0 - fd1;

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
if (false) { throw new CountDownExc(-1); }
    ad1 *= -1;
    ab2 = !ab3;
    ad2 *= -1;
    ad3 *= -1;
if(ao1 != null){
      ad4 = ao1.m3(ab4, fb0, fb1, ab1);
}
    ab2 = !ab3;
    fd0 = fd1 - ad1;
    Output.points[3][3] -= ad2;
    ad3 = ad4 + fd0;
    ab4 = fb0 && fb1;
    ab1 = ab2 || ab3;
    fd1 *= -1;
if(ao2 != null){
      ao2.m2();
}
    ab4 = fb0 && fb1;
    Output.points[3][4] -= ad1;
if(ao4 != null){
      ao3 = ao4.m4(ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fo0.m1(fo1, ao1, ao2, ao3);
}
    fd1 = ad1 + ad2;
    fb0 = ad3 < ad4;
    Thought lo0 = Thought64.getInstance(ao4, fo0, fo1, ao1, fd0, fd1, ad1, ad2, fb1, ab1, ab2, ab3);
    ab4 = !fb0;
    Thought lo1 = Thought5.getInstance(ao2, ao3, ao4, fo0, fb1, ab1, ab2, ab3);
    ab4 = !fb0;
if(fo1 != null){
      fo1.m2(ad3, ad4, fd0, fd1);
}
    double ld2 = 494.14203036207095;

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
if (false) { throw new CountDownExc(-1); }
    double ld0 = 731.157408591175;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0);
}
if(fo0 != null){
      fo0.m1(fb1, fb0, fb1, fb0);
}
    boolean lb1 = false;
    fb0 = fd0 > fd1;
    fb1 = ld0 > fd0;
    lb1 = fd1 > ld0;
    fb0 = fd0 > fd1;
    Thought lo2 = Thought39.getInstance();
    Thought lo3 = Thought37.getInstance(ld0, fd0, fd1, ld0, fb1, lb1, fb0, fb1);
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld0, fd0, lb1, fb0, fb1, lb1);
}
    fb0 = fb1 || lb1;
    fb0 = fd1 > ld0;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fb1, lb1, fb0, fb1);
}
    lb1 = fb0 && fb1;
    lb1 = fb0 || fb1;
    fd1 = ld0 - fd0;
    Thought lo4 = Thought81.getInstance(fd1, ld0, fd0, fd1);
    ld0 = fd0 + fd1;
    ld0 = fd0 + fd1;
if(fo1 != null){
      ld0 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, ld0, fd0);
}
    lb1 = !fb0;
        Thought lo5 = Thought92.getInstance(fb1, lb1, fb0, fb1);
    Thought lo6 = Thought3.getInstance();
    lb1 = !fb0;
    Thought lo7 = Thought6.getInstance(fd1, ld0, fd0, fd1, fb1, lb1, fb0, fb1);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
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
void own() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
        fd0 = fd1 - fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    double ld0 = 855.0489782917143;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld0, fd0);
}
    Output.points[3][5] += fd1;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, ld0, fd0, fd1, ld0);
}
    fd0 *= -1;
    fb1 = fb0 || fb1;
if(fo1 != null){
      fd1 = fo1.m3(fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
    fb1 = !fb0;
if(fo0 != null){
      ld0 = fo0.m3();
}
    Output.points[3][6] -= fd0;
if(fo1 != null){
      fd1 = fo1.m3(ld0, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 || fb1;
    boolean lb1 = true;
    boolean lb2 = true;

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
if (false) { throw new CountDownExc(-1); }
    double ld0 = 598.3524403112525;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0);
}
    double ld1 = 431.7417439754935;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, ld0, ld1, fb0, fb1, fb0, fb1);
}
    fd0 *= -1;
    fb0 = !fb1;
    fb0 = fd1 > ld0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    Thought lo2 = Thought26.getInstance(ld1, fd0, fd1, ld0);
    Thought lo3 = Thought89.getInstance(fo0, fo1, fo0, fo1, ld1, fd0, fd1, ld0);
if(fo1 != null){
      fo0 = fo1.m4(fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fb1 = fo0.m2();
}
    boolean lb4 = true;
if(fo0 != null){
      fo1 = fo0.m4(ld1, fd0, fd1, ld0, lb4, fb0, fb1, lb4);
}
    fb0 = !fb1;
if(fo1 != null){
      lb4 = fo1.m2(fo0, fo1, fo0, fo1);
}
    fb0 = !fb1;
    boolean lb5 = true;
    lb4 = !lb5;

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
